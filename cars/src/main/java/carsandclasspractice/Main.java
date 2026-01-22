package carsandclasspractice;

public class Main {

    public static void main(String[] args) {
        for (String model : Make.FORD.getModels()) 
        {
            System.out.println("FORD Model: " + model);
        }
    }
}