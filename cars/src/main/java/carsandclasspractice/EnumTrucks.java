package carsandclasspractice;

public enum EnumTrucks {
    Syclone("GMC", "Syclone", 3600, 100),
    Lightning("Ford", "SVT-Lightning", 4600, 100),
    Silverado("Chevrolet", "Silverado SS", 5300, 100);

    private final String make;
    private final String model;
    private final int weight;
    private int grip;

    EnumTrucks(String make, String model, int weight, int grip) {
        this.make = make;
        this.model = model;
        this.weight = weight;
        this.grip = grip;
    }

    public String getMake() {return make;}
    public String getModel() {return model;}
    public int getWeight() {return weight;}
    public int getGrip() {return grip;}
}