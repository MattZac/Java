package carsandclasspractice;

public enum EnumMotorcycle {
    Hayabusa("Suzuki", "Hayabusa", 380, 190),
    GSX("Suzuki", "GSX-R1000", 450, 195),
    ZX("Kawasaki", "ZX-14R", 600, 210);

    private final String make;
    private final String model;
    private final int weight;
    private final int hp;

    EnumMotorcycle(String make, String model, int weight, int hp) {
        this.make = make;
        this.model = model;
        this.weight = weight;
        this.hp = hp;
    }

    public String getMake() {return make;}
    public String getModel() {return model;}
    public int getWeight() {return weight;}
    public int getHp() {return hp;}
}