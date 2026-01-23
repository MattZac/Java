package carsandclasspractice;

public enum EnumCars {
    Supra("Toyota", "Supra-MK5", 3400, 100),
    Demon("Dodge", "Demon", 4300, 100),
    M3("BMW", "G80-M3", 4000, 100);

    private final String make;
    private final String model;
    private final int weight;
    private int grip;

    EnumCars(String make, String model, int weight, int grip) {
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