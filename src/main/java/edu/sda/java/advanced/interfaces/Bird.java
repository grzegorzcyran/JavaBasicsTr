package edu.sda.java.advanced.interfaces;

public class Bird implements Flying {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String fly() {
        return "Bird " + name + "is flying.";
    }
}
