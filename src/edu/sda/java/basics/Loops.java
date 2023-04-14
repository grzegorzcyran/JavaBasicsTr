package edu.sda.java.basics;

import java.util.List;

public class Loops {
    public static void main(String[] args) {
        forLoop();
        forEachLoop();
        whileLoops();
        doWhileLoop();
    }

    private static void forLoop() {
        System.out.println("First loop");
        for(int i = 0; i < 10; i++) {
            System.out.println("I in iteration : " + i);
        }

        System.out.println("\nDecrement loop");
        for (int i = 5; i > 0; i--) {
            System.out.println("Decrementing: " + i);
        }

        System.out.println("Infinity loop");
        for (int i = 1; i > 0; i++) {
            if(i > 30 && i < 50) {
                continue; //if i is between 30 and 50, loop goes to next iteration without executing code under "continue"
            }
            System.out.println("Infinity loop i " + i);
            if(i > 100) {
                break; // break statement causes current loop to stop and continues executing program after the loop
            }
        }
    }

    private static void forEachLoop() {
        List<String> strings = List.of("Janek", "Marek", "Asia", "Renata");
        for(String element : strings) {
            System.out.println("Current is " + element);
        }
    }

    private static void whileLoops() {
        int check = 10;
        while (check > 0) {
            System.out.println("doing sth in while loop");
            check--;
        }

        while (check > 100) {
            System.out.println("This will (hopefully) not execute");
            check--;
        }

//        while (true) {
//            System.out.println("Infinity while loop");
//        }
    }

    private static void doWhileLoop() {
        System.out.println("Do-while loop");
        int check = 10;
        do {
            System.out.println("Print " + check);
            check++;
        } while (check < 20);

        System.out.println("Condition wrong but do-while loop executes once");

        boolean checkBoolean = false;
        do {
            System.out.println("We expect checkBoolean true? " + false);
        } while (checkBoolean); //this line is equal to the below one
        //} while (checkBoolean == true); //equal to above line
    }
}
