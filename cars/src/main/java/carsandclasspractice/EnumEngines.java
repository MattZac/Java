package carsandclasspractice;

public enum EnumEngines {
    //Car and Truck Engine Options
    RB("RB26DETT", "Inline", 6, 300, 260, EnumForcedInduction.TWINTURBO),
    JZ("2JZ", "Inline", 6, 320, 330, EnumForcedInduction.TWINTURBO),
    LS("LS1", "V", 8, 350, 365, EnumForcedInduction.NA),

    //Motorcycle Engine Options
    HAYABUSA("Hayabusa Engine", "Inline", 4, 190, 110, EnumForcedInduction.NA),
    GSX("GSX-R1000 Engine", "Inline", 4, 200, 90, EnumForcedInduction.NA),
    ZX("ZX-14R Engine", "Inline", 4, 200, 115, EnumForcedInduction.NA);

    private final String name;
    private final String config;
    private final int cylinders;
    private final int basehp;
    private final int torque; //lb-ft
    private final EnumForcedInduction fi;

    EnumEngines(String name, String config, int cylinders, int basehp, int torque, EnumForcedInduction fi) {
        this.name = name;
        this.config = config;
        this.cylinders = cylinders;
        this.basehp = basehp;
        this.torque = torque;
        this.fi = fi;
    }

    public String getName() {return name;}
    public String getConfig() {return config;}
    public int getCylinders() {return cylinders;}
    public int getBaseHp() {return basehp;}
    public int getTorque() {return torque;}
    public EnumForcedInduction getFi() {return fi;}
}