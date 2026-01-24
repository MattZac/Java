package carsandclasspractice;

public enum EnumCars implements EnumConnector {
    Supra("Toyota", "Supra-MK5", 3400, 100),
    Demon("Dodge", "Demon", 4300, 100),
    M3("BMW", "G80-M3", 4000, 100);

    private final String make;
    private final String model;
    private final int weight;
    private final int grip;

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