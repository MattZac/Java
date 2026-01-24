package carsandclasspractice;

public enum EnumTrucks implements EnumConnector {
    Syclone("GMC", "Syclone", 3600, 100),
    Lightning("Ford", "SVT-Lightning", 4600, 100),
    Silverado("Chevrolet", "Silverado SS", 5300, 100);

    private final String make;
    private final String model;
    private final int weight;
    private final int grip;

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