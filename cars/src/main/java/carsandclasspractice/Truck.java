package carsandclasspractice;

public class Truck extends Vehicle {

    public Truck(String make, String model, int weight, int grip, Engine engine) {
        super(make, model, weight, grip, engine);
    }

    protected void awdUpgrade() {
        super.setGrip(getGrip() + 200);
    }

    //Bed Weight: Adds weights to the truck bed, adding 500 lbs but doubling grip
    @Override
    protected void specialAbility() {
        super.setWeight((getWeight() + 500));
        super.setGrip(getGrip() * 2);
    }
}