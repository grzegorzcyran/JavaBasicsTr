package edu.sda.java.advanced.abstraction;

public class ElectricCar extends Car {

    public ElectricCar(String vin) {
        super(vin);
    }

    public void setNoOfKms(int noOfKms) {
        super.noOfKms = noOfKms; //yet another usage of "super" keyword - access methods and / or fields from superclass
    }

    @Override
    public void runEngine() {
        System.out.println("Start and go!");
    }

    @Override
    public void fillFuel() {
        System.out.println("Plugged to power supply");
    }
}
