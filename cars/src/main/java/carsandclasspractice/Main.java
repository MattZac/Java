package carsandclasspractice;

public class Main {

    public static void main(String[] args) {
        Motorcycle moto1 = new Motorcycle(EnumMotorcycles.HAYABUSA, new Engine(EnumMotorcycles.HAYABUSA));
        System.out.println("");
        System.out.println("Motorcycle Make: " + moto1.getMake());
        System.out.println("Motorcycle Model: " + moto1.getModel());
        System.out.println("Engine Name: " + moto1.getEngine().getName());
        System.out.println("Horsepower: " + moto1.getEngine().getTotalHp());

        Car car1 = new Car(EnumCars.M3, new Engine(EnumEngines.LS));
        System.out.println("");
        System.out.println("Car Make: " + car1.getMake());
        System.out.println("Car Model: " + car1.getModel());
        System.out.println("Engine Name: " + car1.getEngine().getName());
        System.out.println("Horsepower: " + car1.getEngine().getTotalHp());
    }
}