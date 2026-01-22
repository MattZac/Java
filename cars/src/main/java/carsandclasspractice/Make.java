package carsandclasspractice;

public enum Make{
    FORD(new String[]{"F-150", "Mustang", "GT"}),
    TOYOTA(new String[]{"Supra", "Tacoma", "Camry"}),
    DUCATI(new String[]{"Panigale", "Monster", "Multistrada"});

    private final String[] models;

    Make(String[] models) {
        this.models = models;
    }

    public String[] getModels() {
        return models;
    }
}