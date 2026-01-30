package carsandclasspractice;

import carsandclasspractice.Enums.EnumCars;
import carsandclasspractice.Enums.EnumEngines;
import carsandclasspractice.Enums.EnumTrucks;


public class Main {

    public static void main(String[] args) {
        Truck truck1 = new Truck(EnumTrucks.Silverado, new Engine(EnumEngines.LS));

        Car car1 = new Car(EnumCars.M4, new Engine(EnumEngines.JZ));

        Raceway raceway = new Raceway(car1, truck1);
        raceway.race(car1, truck1);
    }
}