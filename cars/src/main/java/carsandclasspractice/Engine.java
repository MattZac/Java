package carsandclasspractice;

import carsandclasspractice.Enums.EnumEngines;
import carsandclasspractice.Enums.EnumForcedInduction;
import carsandclasspractice.Enums.EnumMotorcycles;

public class Engine {

    private final String name;
    private final String config;
    private final int cylinders;
    private final int basehp;
    private final int torque; //lb-ft
    private final EnumForcedInduction fi;

    public Engine(EnumEngines eEngine) {
        this.name = eEngine.getName();
        this.config = eEngine.getConfig();
        this.cylinders = eEngine.getCylinders();
        this.basehp = eEngine.getBaseHp();
        this.torque = eEngine.getTorque();
        this.fi = eEngine.getFi();
    }

    public Engine(EnumMotorcycles eMotorcycle) {
        this.name = eMotorcycle.getEngine().getName();
        this.config = eMotorcycle.getEngine().getConfig();
        this.cylinders = eMotorcycle.getEngine().getCylinders();
        this.basehp = eMotorcycle.getEngine().getBaseHp();
        this.torque = eMotorcycle.getEngine().getTorque();
        this.fi = eMotorcycle.getEngine().getFi();
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