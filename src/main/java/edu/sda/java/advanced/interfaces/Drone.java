package edu.sda.java.advanced.interfaces;

public class Drone implements Flying {
    private String model;

    public Drone(String model) {
        this.model = model;
    }

    @Override
    public String fly() {
        return "Drone " + model + " is in the air";
    }
}
