package carsandclasspractice;

public enum EnumTruck {
    Syclone("GMC", "Syclone", 3600),
    Lightning("Ford", "SVT-Lightning", 4600),
    Silverado("Chevrolet", "Silverado SS", 5300);

    private final String make;
    private final String model;
    private final int weight;

    EnumTruck(String make, String model, int weight) {
        this.make = make;
        this.model = model;
        this.weight = weight;
    }

    public String getMake() {return make;}
    public String getModel() {return model;}
    public int getWeight() {return weight;}
}