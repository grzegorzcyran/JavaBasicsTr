package edu.sda.java.basics;

import java.util.Random;

public class Varargs {


    class Pair{
        int left;
        String right;
    }

    public static void main(String[] args) {
        varArgsOne(1);
        System.out.println("=============");
        varArgsOne(5, 6, 7);
        System.out.println("=============");
        varArgsOne(1,2,3,4,5,6);
        System.out.println("=============");
        varArgsOne();
        System.out.println("=============");
        varArgsTwo("Grzesiek", 45, 1,2,3);

    }

    int calculateSth(Pair ... pairs) {
        int result = 0;
        for (Pair pair : pairs) {
            result += pair.left;
            System.out.println(pair.right);
        }
        return result;
    }

    /**
     * we can call method with no args or with many args
     * ... means 0 or more
     */
    private static void varArgsOne(int ... params) {
        for (int i = 0; i < params.length; i++) {
            System.out.println("Param number " + i + " is: " + params[i]);
        }

        for (int param : params) {
            System.out.println("Iterating over elements");
        }
    }

    /**
     * In this case we need to define "name" and "age" params
     * and we can put multiple "classes" params - between 0 and "many"
     */
    private static void varArgsTwo(String name, int age, int ... classes) {
        System.out.println(name);
        System.out.println(age);
        System.out.println("Classes:");
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }
    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
    //...
    int sum(int ... pars) {
        int result = 0;
        for (int par : pars) {
            result += par;
        }
        return result;
    }

}

/**
 *
 * Write an application that consists of few classes:
 * a. Author class, representing an author – poem writer, which consists of fields surname
 * and nationality (both of type String)
 * b. Poem class, representing poem, which consists of fields creator (type Author) and
 * stropheNumbers (type int – numbers of strophes in poem)
 * c. Main class, with main method, inside which you will:
 *    Create three instances of Poem class, fill them with data (using constructor and/or setters) and store them in array
 *    Write a surname of an author, that wrote a longest poem (let your application calculate it!)
 */

/**
 *
 * Add a date of creation to Poem class
 * Add a date of birth to Author class
 * Add a number of books sold to Poem class
 *
 * Add 3 - 5 more Poems, at least 3 Authors should be created too
 *
 * Print authors from oldest to youngest
 * Print poems from least sold to top sold
 *
 */

/**
 * Print authors born between 1975 and 1995
 * Print title and year of poem of authors born in 1980's
 */

/**
 * Add a class Review
 * It should store Poem and score - score between 0 and 100
 *
 * Add a class Publication
 * It should contain date of publication, number of books printed (within this publication) and Poem
 *
 * Add reviews for Poems
 *
 * Add publications for Poems - create an array for that, consider several publications of same poems but with different dates
 *
 * Print poem titles that get review over 60
 *
 * Print poem titles and total number of books published for that title
 */

/**
 * Write an application that "stutters", that is, reads the user's text (type String), and prints the given text, in which each word is printed twice.
 * For example, for the input: "This is my test" the application should print "This This is is my my test test".
 */

/**
 * Write an application that implements a simple calculator. The application should:
 *  a. read first number (type float)
 *  b. read one of following symbols: + - / *
 *  c. read second number (type float)
 *  d. return a result of given mathematical operation
 * If the user provides a symbol other than supported, the application should print "Invalid symbol".
 * If the entered action cannot be implemented (i.e. it is inconsistent with the principles of mathematics),
 * the application should print "Cannot calculate".
 */

/**
 * Write an application that will take a positive number from the user (type int)
 * and draw a wave with a given length and height of 4 lines,
 * according to the following example (fill empty spaces with spaces):
 *
 *   *      **      **
 *    *    *  *    *  *
 *     *  *    *  *    *
 *      **      **
 */

/**
 * Write an application that will take a positive number from the user (type int)
 * and calculate the Fibonacci number at the indicated index.
 * For example, if the number equals 5, your program should print the fifth Fibonacci number.
 * In Fibonacci sequence, each number is the sum of the two preceding ones.
 * For example, the first few Fibonacci numbers are:
 *
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...
 */