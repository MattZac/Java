package carsandclasspractice;

public enum EnumCar {
    Supra("Toyota", "Supra-MK5", 3400),
    Demon("Dodge", "Demon", 4300),
    M3("BMW", "G80-M3", 4000);

    private final String make;
    private final String model;
    private final int weight;

    EnumCar(String make, String model, int weight) {
        this.make = make;
        this.model = model;
        this.weight = weight;
    }

    public String getMake() {return make;}
    public String getModel() {return model;}
    public int getWeight() {return weight;}
}