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

        /**
         * When passing object to println (or other methods that accept String as parameter
         * by default method toString() is called
         */
        System.out.println(this);
        //Above and below we have same piece of code - toString is called by default
        System.out.println(this.toString());
    }
}
