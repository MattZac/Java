package carsandclasspractice.Enums;

import carsandclasspractice.EnumInterface;

public enum EnumTrucks implements EnumInterface {
    Syclone("GMC", "Syclone", 3600, 100),
    Lightning("Ford", "SVT-Lightning", 4600, 100),
    Silverado("Chevrolet", "Silverado SS", 5300, 100);

    protected final String make;
    protected final String model;
    protected final int weight;
    protected final int grip;

    EnumTrucks(String make, String model, int weight, int grip) {
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