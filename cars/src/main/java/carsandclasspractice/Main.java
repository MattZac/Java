package carsandclasspractice;

import java.util.Scanner;

import carsandclasspractice.Enums.EnumCars;
import carsandclasspractice.Enums.EnumEngines;
import carsandclasspractice.Enums.EnumForcedInduction;
import carsandclasspractice.Enums.EnumMotorcycles;
import carsandclasspractice.Enums.EnumTrucks;

public class Main {

    public static EnumCars[] carsOptions = EnumCars.values();
    public static EnumTrucks[] trucksOptions = EnumTrucks.values();
    public static EnumMotorcycles[] motorcyclesOptions = EnumMotorcycles.values();
    public static EnumEngines[] enginesOptions = EnumEngines.values();
    public static EnumForcedInduction[] FIOptions = EnumForcedInduction.values();

    public static void main(String[] args) {

        Player p1 = new Player(null);
        Player p2 = new Player(null);

        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        System.out.println("""
             _____                                __  _____ __                       
            / ___/___ _ ____ ___   ___ _ ___  ___/ / / ___// /___ _ ___  ___ ___  ___
           / /__ / _ `// __/(_-<  / _ `// _ \\/ _  / / /__ / // _ `/(_-< (_-</ -_)(_-<
           \\___/ \\_,_//_/  /___/  \\_,_//_//_/\\_,_/  \\___//_/ \\_,_//___//___/\\__//___/
                                                                                     
        """);

        System.out.println("\nWelcome racers! Player 1, please select your vehicle to begin:\n");
        vehicleMenu(p1, scanner);

        System.out.println("\nPlayer 2, please select your vehicle to begin:\n");
        vehicleMenu(p2, scanner);

        scanner.close();

        // Play starting animation

        Raceway raceway = new Raceway(p1.getVehicle(), p2.getVehicle());
        raceway.race(p1.getVehicle(), p2.getVehicle());
    }

    public static void vehicleMenu(Player p, Scanner scanner) {
        System.out.println("Select Vehicle Type:");
        System.out.println("1. Car");
        System.out.println("2. Truck");
        System.out.println("3. Motorcycle");
        System.out.println();

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> carMenu(p, scanner);
            case 2 -> truckMenu(p, scanner);
            case 3 -> motorcycleMenu(p, scanner);
            default -> {
                System.out.println("Invalid choice! Please try again.");
                vehicleMenu(p, scanner);
            }
        }
    }

    public static void carMenu(Player p, Scanner scanner) {
        System.out.println("[Car] Type Selected! Choose A Model:");
        for (int i = 0; i < carsOptions.length; i++) {
            System.out.println((i + 1) + ". " + carsOptions[i].getMake() + " " + carsOptions[i].getModel());
        }
        System.out.println();

        int carChoice = scanner.nextInt();
        switch (carChoice) {
            case 1 -> {
                p.setVehicle(new Car(carsOptions[0], null));
                System.out.println("You selected: " + carsOptions[0].getMake() + " " + carsOptions[0].getModel());
                EngineMenu(p, scanner);
            }
            case 2 -> {
                p.setVehicle(new Car(carsOptions[1], null));
                System.out.println("You selected: " + carsOptions[1].getMake() + " " + carsOptions[1].getModel());
                EngineMenu(p, scanner);
            }
            case 3 -> {
                p.setVehicle(new Car(carsOptions[2], null));
                System.out.println("You selected: " + carsOptions[2].getMake() + " " + carsOptions[2].getModel());
                EngineMenu(p, scanner);
            }
            default -> {
                System.out.println("Invalid choice! Please try again.");
                carMenu(p, scanner);
            }
        }
    }

    public static void truckMenu(Player p, Scanner scanner) {
        System.out.println("[Truck] Type Selected! Choose A Model:");
        for (int i = 0; i < trucksOptions.length; i++) {
            System.out.println((i + 1) + ". " + trucksOptions[i].getMake() + " " + trucksOptions[i].getModel());
        }
        System.out.println();

        int carChoice = scanner.nextInt();
        switch (carChoice) {
            case 1 -> {
                p.setVehicle(new Truck(trucksOptions[0], null));
                System.out.println("You selected: " + trucksOptions[0].getMake() + " " + trucksOptions[0].getModel());
                EngineMenu(p, scanner);
            }
            case 2 -> {
                p.setVehicle(new Truck(trucksOptions[1], null));
                System.out.println("You selected: " + trucksOptions[1].getMake() + " " + trucksOptions[1].getModel());
                EngineMenu(p, scanner);
            }
            case 3 -> {
                p.setVehicle(new Truck(trucksOptions[2], null));
                System.out.println("You selected: " + trucksOptions[2].getMake() + " " + trucksOptions[2].getModel());
                EngineMenu(p, scanner);
            }
            default -> {
                System.out.println("Invalid choice! Please try again.");
                truckMenu(p, scanner);
            }
        }
    }

    public static void motorcycleMenu(Player p, Scanner scanner) {
        System.out.println("[Motorcycle] Type Selected! Choose A Model:");
        for (int i = 0; i < motorcyclesOptions.length; i++) {
            System.out.println((i + 1) + ". " + motorcyclesOptions[i].getMake() + " " + motorcyclesOptions[i].getModel());
        }
        System.out.println();

        int carChoice = scanner.nextInt();
        switch (carChoice) {
            case 1 -> {
                p.setVehicle(new Motorcycle(motorcyclesOptions[0], new Engine(motorcyclesOptions[0])));
                System.out.println("You selected: " + motorcyclesOptions[0].getMake() + " " + motorcyclesOptions[0].getModel());
                fiMenu(p, scanner);
            }
            case 2 -> {
                p.setVehicle(new Motorcycle(motorcyclesOptions[1], new Engine(motorcyclesOptions[1])));
                System.out.println("You selected: " + motorcyclesOptions[1].getMake() + " " + motorcyclesOptions[1].getModel());
                fiMenu(p, scanner);
            }
            case 3 -> {
                p.setVehicle(new Motorcycle(motorcyclesOptions[2], new Engine(motorcyclesOptions[2])));
                System.out.println("You selected: " + motorcyclesOptions[2].getMake() + " " + motorcyclesOptions[2].getModel());
                fiMenu(p, scanner);
            }
            default -> {
                System.out.println("Invalid choice! Please try again.");
                motorcycleMenu(p, scanner);
            }
        }
    }

    public static void EngineMenu(Player p, Scanner scanner) {
        System.out.println("Choose An Engine:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + enginesOptions[i].getName() + " - " + (enginesOptions[i].getBaseHp() + enginesOptions[i].getFi().getHpAdd()) + " HP");
        }
        System.out.println();

        int engineChoice = scanner.nextInt();
        switch (engineChoice) {
            case 1 -> {
                p.getVehicle().setEngine(new Engine(enginesOptions[0]));
                System.out.println("You selected: " + enginesOptions[0].getName());
                fiMenu(p, scanner);
            }
            case 2 -> {
                p.getVehicle().setEngine(new Engine(enginesOptions[1]));
                System.out.println("You selected: " + enginesOptions[1].getName());
                fiMenu(p, scanner);
            }
            case 3 -> {
                p.getVehicle().setEngine(new Engine(enginesOptions[2]));
                System.out.println("You selected: " + enginesOptions[2].getName());
                fiMenu(p, scanner);
            }
            default -> {
                System.out.println("Invalid choice! Please try again.");
                EngineMenu(p, scanner);
            }
        }
    }

    public static void fiMenu(Player p, Scanner scanner) {
        System.out.println("Choose Forced Induction:");
        for (int i = 0; i < FIOptions.length; i++) {
            System.out.println((i + 1) + ". " + FIOptions[i].getType() + " - +" + FIOptions[i].getHpAdd() + " HP");
        }
        System.out.println();

        int fiChoice = scanner.nextInt();
        switch (fiChoice) {
            case 1 -> {
                p.getVehicle().getEngine().setFi(FIOptions[0]);
                System.out.println("You selected: " + FIOptions[0].getType());
            }
            case 2 -> {
                p.getVehicle().getEngine().setFi(FIOptions[1]);
                System.out.println("You selected: " + FIOptions[1].getType());
            }
            case 3 -> {
                p.getVehicle().getEngine().setFi(FIOptions[2]);
                System.out.println("You selected: " + FIOptions[2].getType());
            }
            case 4 -> {
                p.getVehicle().getEngine().setFi(FIOptions[3]);
                System.out.println("You selected: " + FIOptions[3].getType());
            }
            default -> {
                System.out.println("Invalid choice! Please try again.");
                fiMenu(p, scanner);
            }
        }
    }
}