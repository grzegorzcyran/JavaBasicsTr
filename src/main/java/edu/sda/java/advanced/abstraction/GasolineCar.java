package edu.sda.java.advanced.abstraction;

/**
 * This is class that takes general idea of Car and adds some special
 * settings typical to Gasoline Car
 *
 * Keyword "extends" indicates that we treat GasolineCar as subtype of Car
 */

public class GasolineCar extends Car {

    private String fuelType;
    /**
     * As we have constructor in Car class
     * we need to add one here and pass values to
     * Car(String vin)
     */
    public GasolineCar(String vin, String fuelType) {
        /**
         * Keyword "super" refers to base class - in this case
         * calling super(vin) refers to constructor
         *
         * Calling constructor from base class MUST be first what we do
         * in subclass constructor
         */
        super(vin);

        /**
         * We can set other settings related to GasolineCar here
         */
        this.fuelType = fuelType;
    }

    public GasolineCar(String vin, int noOfKms, String fuelType) {
        super(vin, noOfKms); //refering to second constructor in superclass
        this.fuelType = fuelType;
    }

    public GasolineCar(String vin, int noOfKms) {
        super(vin, noOfKms);
    }

    /**
     * We need to prepare a code for runEngine() method
     *
     * To mark a method as being derived from Car class,
     * we use annotation @Override
     *
     * Override annotation is an information that for this class
     * we'll use this definition of method instead of general one
     * Overriding requires keeping same number and type of parameters, method name and return type
     *
     * As for the access (public, protected, package-private) we have to keep same access level
     * or add a wider one on override
     *
     * package private abstract -> package private - ok
     * package private abstract -> public - ok
     * public -> protected - not ok, as public is wider and we try to narrow it down
     */
    @Override
    public void runEngine() {
        System.out.println("Engine is running!");
    }

    @Override
    public void fillFuel() {
        System.out.println("On a gas station, refualling!");
    }
}
