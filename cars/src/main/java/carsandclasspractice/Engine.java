package carsandclasspractice;

public class Engine {

    private final String name;
    private final String config;
    private final int cylinders;
    private final int basehp;
    private final int torque; //lb-ft
    private final EnumForcedInduction fi;

    public Engine(String name, String config, int cylinders, int basehp, int torque, EnumForcedInduction fi) {
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

    public int getTotalHp() {
        return basehp + fi.getHpAdd();
    }
}