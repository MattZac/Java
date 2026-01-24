package carsandclasspractice;

public class Motorcycle extends Vehicle {

    private boolean crashed_status = false;

    public Motorcycle(EnumMotorcycles eMotorcycle, Engine engine) {
        super(eMotorcycle, engine);
    }

    //Wheelie Launch: Triples grip but has a 20% chance to crash
    @Override
    protected void specialAbility() {
        super.setGrip(getGrip() * 3);
        // Simulate a 20% chance to crash
        if (Math.random() < 0.2) {
            super.setGrip(1); // Crash results in near 0 grip
            crashed_status = true;
        }
    }

    public boolean getStatus() {return crashed_status;}
    public boolean setStatus(boolean status) {
        this.crashed_status = status;
        this.setGrip(50);
        return crashed_status;
    }
}