package edu.sda.java.advanced.exceptions;

public class ThrowMyExceptionDemo {

    public static void main(String[] args) {

        System.out.println("I'll throw my own exception");
        throw new MyOwnException("xxx");
    }
}
