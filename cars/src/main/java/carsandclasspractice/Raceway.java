package carsandclasspractice;

import java.time.Duration;
import java.time.Instant;

public class Raceway {
    protected Vehicle vehicle1;
    protected Vehicle vehicle2;

    public Raceway(Vehicle vehicle1, Vehicle vehicle2) {
        this.vehicle1 = vehicle1;
        this.vehicle2 = vehicle2;
    }

    // ----------------------------------------------
    // NEW PHYSICS CALCULATIONS, HEAVY USE OF AI HERE
    // ----------------------------------------------
    
    private double calculateAcceleration(Vehicle v) {
        // Newton's Law: F = ma  ->  a = F / m
        // Force is derived from Torque * Grip
        // We divide by Weight
        // The * 10.0 is a game-balance constant to make cars accelerate visibly
        double torque = v.getEngine().getTorque();
        double weight = v.getWeight();
        double grip = v.getGrip(); // Assuming 0.0 to 1.0 or similar multiplier
    
        return (torque * grip * 10.0) / weight;
    }
    
    private double calculateTopSpeed(Vehicle v) {
        // HP generally dictates how fast you can go against air resistance
        // This is a simplified "Terminal Velocity"
        return v.getEngine().getTotalHp() * 0.8; 
    }
    
    // Updated String builder to show Speedometer
    private String buildTrackString(double current, double total, String name, double speed) {
        int trackLen = 100;
        double pct = current / total;
        if (pct > 1.0) pct = 1.0;
        
        int carPos = (int) (pct * (trackLen - 1));
        
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < trackLen; i++) {
            if (i == carPos) sb.append("■");
            else sb.append("-");
        }
        // Added a Speedometer display at the end of the line
        sb.append(String.format("] %-10s Spd: %.0f", name, speed));
        
        return sb.toString();
    }

    public Vehicle race(Vehicle v1, Vehicle v2) {
        // Distance to finish (arbitrary units)
        // 50000 units results in ~1/4 mile times for most vehicles
        double raceDist = 50000.0;
        
        // Current position (Distance from start line)
        double v1Dist = 0;
        double v2Dist = 0;

        //Time to finish line
        double v1TTF = 0;
        double v2TTF = 0;
        
        // Current Velocity (Starts at 0)
        double v1Velocity = 0;
        double v2Velocity = 0;
        
        // Calculate Acceleration based on Torque/Weight
        // We multiply by a scalar (e.g., 50) to make the numbers feel right for the game scale
        double v1Accel = calculateAcceleration(v1);
        double v2Accel = calculateAcceleration(v2);
    
        // Calculate Top Speed (The 'Cap') based on HP
        double v1TopSpeed = calculateTopSpeed(v1);
        double v2TopSpeed = calculateTopSpeed(v2);
    
        // Gap to clear console, a poor man's ctrl+l lol
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        
        System.out.println("\n>>> DRAG RACE START <<<");
        System.out.println("\n" + v1.getMake() + " " + v1.getModel() + " [V/S] " + v2.getMake() + " " + v2.getModel());
        System.out.println(); 
    
        Vehicle winner = null;
        Vehicle loser = null;

        Instant v1start = Instant.now();
        Instant v2start = Instant.now();

        while (v1Dist < raceDist || v2Dist < raceDist) {
            
            // --- PHYSICS UPDATE FOR VEHICLE 1 ---
            if (v1Dist < raceDist) {
                // Increase speed by acceleration
                v1Velocity += v1Accel;
                // Cap speed at max HP limit (Aerodynamics logic simplified)
                if (v1Velocity > v1TopSpeed) {
                    v1Velocity = v1TopSpeed;
                }
                // Move car by current velocity
                v1Dist += v1Velocity;
            }
    
            // --- PHYSICS UPDATE FOR VEHICLE 2 ---
            if (v2Dist < raceDist) {
                // Increase speed by acceleration
                v2Velocity += v2Accel;
                // Cap speed at max HP limit (Aerodynamics logic simplified)
                if (v2Velocity > v2TopSpeed) {
                    v2Velocity = v2TopSpeed;
                }
                // Move car by current velocity
                v2Dist += v2Velocity;
            }
    
            // --- INDEPENDENT FINISH & TIME LOGIC ---
    
            // Check Vehicle 1
            if (v1Dist >= raceDist && v1TTF == 0) {
                Instant v1end = Instant.now();
                v1TTF = Duration.between(v1start, v1end).toMillis() / 1000.0;
        
                // If no winner exists yet, V1 is the winner
                if (winner == null) {
                    winner = vehicle1;
                    loser = vehicle2;
                }
            }

            // Check Vehicle 2
            if (v2Dist >= raceDist && v2TTF == 0) {
                Instant v2end = Instant.now();
                v2TTF = Duration.between(v2start, v2end).toMillis() / 1000.0;
                
                // If no winner exists yet, V2 is the winner
                if (winner == null) {
                    winner = vehicle2;
                    loser = vehicle1;
                }
            }
    
            // --- RENDER ---
            System.out.println(buildTrackString(v1Dist, raceDist, vehicle1.getMake(), v1Velocity));
            System.out.println(buildTrackString(v2Dist, raceDist, vehicle2.getMake(), v2Velocity));
    
            // --- LOOP CONTROL ---
            if (v1Dist < raceDist || v2Dist < raceDist) {
                System.out.print("\033[2A"); 
                try { Thread.sleep(50); } catch (InterruptedException e) {}
            }
        }
        
        System.out.println(); // Gap for formatting
        String winnerAnnounce = "WINNER: " + winner.getMake() + " " + winner.getModel() + "! " + 
        "Time: " + (winner == vehicle1 ? v1TTF : v2TTF) + " sec";
        int winnerAnnounceLength = winnerAnnounce.length();

        // loop until the solid blocks (▓) fill the entire length for winner
        for (int i = 0; i <= winnerAnnounceLength; i++) {
            StringBuilder frame = new StringBuilder();
            
            // Add solid trailing blocks
            frame.append("▓".repeat(i));
            
            // Add faded leading blocks if there's room
            if (i < winnerAnnounceLength) frame.append("▒");
            if (i + 1 < winnerAnnounceLength) frame.append("░");

            System.out.print("\r" + frame.toString());
            
            try { Thread.sleep(20); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        System.out.println("\r" + winnerAnnounce);

        String loserAnnounce = " LOSER: " + loser.getMake() + " " + loser.getModel() + "! " + 
        "Time: " + (loser == vehicle1 ? v1TTF : v2TTF) + " sec";
        int loserAnnounceLength = loserAnnounce.length();
        
        // loop until the solid blocks (▓) fill the entire length for loser
        for (int i = 0; i <= loserAnnounceLength; i++) {
            StringBuilder frame = new StringBuilder();
            
            // Add solid trailing blocks
            frame.append("▓".repeat(i));
            
            // Add faded leading blocks if there's room
            if (i < loserAnnounceLength) frame.append("▒");
            if (i + 1 < loserAnnounceLength) frame.append("░");

            System.out.print("\r" + frame.toString());
            
            try { Thread.sleep(20); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        System.out.println("\r" +loserAnnounce);

        try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        
        return winner;
    }
}