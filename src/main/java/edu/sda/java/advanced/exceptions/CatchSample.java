package edu.sda.java.advanced.exceptions;

import java.io.*;
import java.util.Scanner;

public class CatchSample {

    public static void main(String[] args) {
        //catchAndSolve();

        /**
         * We might get exception from "passException" and 2 possibilities what we can do:
         *  - we surround that method call with "try - cath" block
         *  - we pass the exception further with "throws" clause on yet another method
         */
        try {
            passException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //catchAndSolveAndFinally();

        npeDemo();

    }

    /**
     * Deprecated as there's another method with better exception solving
     * and stream closing
     * Use tryWithResources() instead
     */
    @Deprecated
    private static void catchAndSolve() {

        try {
            //operation that may but does not have to end with exception
            FileWriter writer = new FileWriter("sampleFile.txt");
            writer.write("Sample line in a file");
            writer.close(); //closes the connection to stream - this time file

        } catch (IOException ex) {
            System.out.println("Some exception happened");
            //here we solve whatever happened - in a way we want
            System.out.println(ex.getCause());
        }
    }

    private static void passException() throws IOException {

        FileReader reader = new FileReader("sampleFile.txt");
        Scanner scanner = new Scanner(reader);

        System.out.println(scanner.nextLine());
        scanner.close();
        reader.close();
        /**
         * This time I do not solve exception here, I rather
         * pass it "up the ladder" - by using "throws" clause on a method
         */
    }

    private static void catchAndSolveAndFinally() {

        try {
            System.out.println("Sout from try block - start");
            FileReader reader = new FileReader(".gitignor");
            System.out.println("Sout from try block - end");
        } catch (FileNotFoundException e) {
            System.out.println("Sout from exception");
            throw new RuntimeException(e);
        } finally {
            System.out.println("THIS will be executed in both cases:");
            System.out.println(" - program will raise an exception");
            System.out.println(" - program will run all good");
        }

    }

    private static void tryWithResources() {

        try(FileWriter writer = new FileWriter(".gitignore-copy")) {
            writer.write("copy of gitignore");
            /**
             * This construction: try-with-resources
             * allows us to not take care about closing the stream
             * ONLY if stream implements Closeable or AutoCloseable interfaces
             */

        } catch (IOException exception) {
            System.out.println(exception.getCause());

        }
    }

    private static String npeDemo() {
        /**
         * The code will produce NullPointerException - or NPE
         * And Java does not force me to solve it by try-cath
         * I's because NPE is not a checked exception, we do not
         * need to solve it, rather fix the code so that it does not happen at all.
         */

        String cause = null;
        System.out.println(cause.toUpperCase());
        return cause;
    }

}
