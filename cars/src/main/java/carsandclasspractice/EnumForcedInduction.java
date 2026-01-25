package carsandclasspractice;

public enum EnumForcedInduction {
    NA("Naturally Aspirated", 0),
    TWINTURBO("Twin Turbo", 100),
    SUPERCHARGER("Supercharger", 300),
    QUADTURBO("Quad Turbo", 800);

    private final String type;
    private final int hpAdd;

    EnumForcedInduction(String type, int hpAdd) {
        this.type = type;
        this.hpAdd = hpAdd;
    }

    public String getType() {return type;}
    public int getHpAdd() {return hpAdd;}
}