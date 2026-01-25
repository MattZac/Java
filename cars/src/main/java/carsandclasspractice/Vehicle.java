package carsandclasspractice;

public abstract class Vehicle {

    protected final String make;
    protected final String model;
    protected int weight;
    protected int grip;
    protected Engine engine;

    public Vehicle(EnumInterface spec, Engine engine) {
        this.make = spec.getMake();
        this.model = spec.getModel();
        this.weight = spec.getWeight();
        this.grip = spec.getGrip();
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