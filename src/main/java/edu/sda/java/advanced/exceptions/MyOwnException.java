package edu.sda.java.advanced.exceptions;

public class MyOwnException extends IllegalArgumentException {

    public MyOwnException() {
        /**
         * this constructor uses non-argument constructor from IllegalArgumentException
         * Even though we do not see that, there's a call super()
         */
        System.out.println("No-arg constructor used");
    }

    public MyOwnException(String s) {
        super(s);
        System.out.println("One-arg constructor used");
    }
}
