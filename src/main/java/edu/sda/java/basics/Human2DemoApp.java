package edu.sda.java.basics;

import edu.sda.java.basics.classes.Human;

public class Human2DemoApp {

    public static void main(String[] args) {
        Human human = new Human();

        //as this is in different package, field "pachagePrivateString" is not accessible anymore
        human.getSurname();
    }
}
