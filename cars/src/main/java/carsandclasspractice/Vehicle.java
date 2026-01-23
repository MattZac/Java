package carsandclasspractice;

public abstract class Vehicle {

    private final String make;
    private final String model;
    private int weight;
    private int grip;
    private Engine engine;

    public Vehicle(String make, String model, int weight, int grip, Engine engine) {
        this.make = make;
        this.model = model;
        this.weight = weight;
        this.grip = grip;
        this.engine = engine;
    }

    protected abstract void specialAbility();

    public String getMake() {return make;}
    public String getModel() {return model;}
    public int getWeight() {return weight;}
    public int getGrip() {return grip;}
    public Engine getEngine() {return engine;}
    public int getTotalHp() {return engine.getTotalHp();}

    public void setWeight(int weight) {this.weight = weight;}
    public void setGrip(int grip) {this.grip = grip;}
    public void setEngine(Engine engine) {this.engine = engine;}
}