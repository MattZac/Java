package carsandclasspractice;

public abstract class Vehicle {

    private final String make;
    private final String model;
    private final int weight;
    private int hp;
    private int grip;
    private Engine engine;

    public Vehicle(String make, String model, int weight, int hp, int grip, Engine engine) {
        this.make = make;
        this.model = model;
        this.weight = weight;
        this.hp = hp;
        this.grip = grip;
        this.engine = engine;
    }

    public String getMake() {return make;}
    public String getModel() {return model;}
    public int getWeight() {return weight;}
    public int getHp() {return hp;}
    public int getGrip() {return grip;}
    public Engine getEngine() {return engine;}
}