package edu.sda.java.advanced.interfaces;

public class Penquin extends Bird {

    public Penquin(String name) {
        super(name);
    }

    @Override
    public String fly() {
        return "Well, penquins are not that much into flying :(";
    }
}
