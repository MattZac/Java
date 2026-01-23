package carsandclasspractice;

public enum EnumEngines {
    //Car and Truck Engine Options
    RB("RB26DETT", "Inline", 6, 300, 260, true),
    JZ("2JZ", "Inline", 6, 320, 330, true),
    LS("LS1", "V", 8, 350, 365, false),

    //Motorcycle Engine Options
    HAYABUSA("Hayabusa Engine", "Inline", 4, 190, 110, false),
    GSX("GSX-R1000 Engine", "Inline", 4, 200, 90, false),
    ZX("ZX-14R Engine", "Inline", 4, 200, 115, false);

    private final String name;
    private final String config;
    private final int cylinders;
    private final int hp;
    private final int torque;
    private final boolean turbo;

    EnumEngines(String name, String config, int cylinders, int hp, int torque, boolean turbo) {
        this.name = name;
        this.config = config;
        this.cylinders = cylinders;
        this.hp = hp;
        this.torque = torque;
        this.turbo = turbo;
    }

    public String getName() {return name;}
    public String getConfig() {return config;}
    public int getCylinders() {return cylinders;}
    public int getHp() {return hp;}
    public int getTorque() {return torque;}
    public boolean isTurbo() {return turbo;}
}