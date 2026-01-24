package carsandclasspractice;

public enum EnumMotorcycles implements EnumConnector {
    HAYABUSA("Suzuki", "Hayabusa", 380, 50, EnumEngines.HAYABUSA),
    GSX("Suzuki", "GSX-R1000", 450, 50, EnumEngines.GSX),
    ZX("Kawasaki", "ZX-14R", 600, 50, EnumEngines.ZX);

    private final String make;
    private final String model;
    private final int weight;
    private final int grip;
    private final EnumEngines engine;

    EnumMotorcycles(String make, String model, int weight, int grip, EnumEngines engine) {
        this.make = make;
        this.model = model;
        this.weight = weight;
        this.grip = grip;
        this.engine = engine;
    }

    @ Override public String getMake() {return make;}
    @Override public String getModel() {return model;}
    @Override public int getWeight() {return weight;}
    @Override public int getGrip() {return grip;}
    public EnumEngines getEngine() {return engine;}
}