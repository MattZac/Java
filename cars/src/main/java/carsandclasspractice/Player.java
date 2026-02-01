package carsandclasspractice;

public class Player {

    private Vehicle vehicle;

    public Player(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public Vehicle getVehicle() {return vehicle;}
    public void setVehicle(Vehicle vehicle) {this.vehicle = vehicle;}
}
