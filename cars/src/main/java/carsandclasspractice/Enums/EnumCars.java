package carsandclasspractice.Enums;

import carsandclasspractice.EnumInterface;

public enum EnumCars implements EnumInterface {
    Supra("Toyota", "Supra-MK5", 3400, 100),
    Demon("Dodge", "Demon", 4300, 100),
    M4("BMW GT3 Edition", "G80-M3", 4000, 100);

    protected final String make;
    protected final String model;
    protected final int weight;
    protected final int grip;

    EnumCars(String make, String model, int weight, int grip) {
        this.make = make;
        this.model = model;
        this.weight = weight;
        this.grip = grip;
    }

    @Override public String getMake() {return make;}
    @Override public String getModel() {return model;}
    @Override public int getWeight() {return weight;}
    @Override public int getGrip() {return grip;}
}