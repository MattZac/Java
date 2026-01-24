package carsandclasspractice;

public class Car extends Vehicle {

    public Car(EnumCars eCar, Engine engine) {
        super(eCar, engine);
    }

    protected void awdUpgrade() {
        super.setGrip(getGrip() + 200);
    }

    //Aero Kit: Reduces weight by 10% and increases grip by 50 points
    @Override
    protected void specialAbility() {
        super.setWeight((int)(getWeight() * 0.9)); //Casted to int to avoid decimal weight
        super.setGrip(getGrip() + 50);
    }
}