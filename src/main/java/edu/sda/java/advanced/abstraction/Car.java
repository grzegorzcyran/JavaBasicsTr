package edu.sda.java.advanced.abstraction;

/**
 * Abstract class = cannot be instanitiated
 * which means we cannot make an object directly from this class
 *
 * Abstract class is "general definition of some type"
 * i.e. Animal and then special classes:Bird, Fish
 */
public abstract class Car {

    private String vin;
    protected int noOfKms; //protected means - access for all classes in same package
    //AND access for all classes that EXTENDS from Car class

    public Car(String vin) {
        this.vin = vin;
    }

    public Car(String vin, int noOfKms) {
        this.vin = vin;
        this.noOfKms = noOfKms;
    }

    public String getVin() {
        return vin;
    }

    public abstract void runEngine();

    public abstract void fillFuel();
}

