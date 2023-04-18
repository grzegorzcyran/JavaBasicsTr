package edu.sda.java.basics;

public class Varargs {

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

    /**
     * we can call method with no args or with many args
     */
    private static void varArgsOne(int ... params) {
        for (int i = 0; i < params.length; i++) {
            System.out.println("Param number " + i + " is: " + params[i]);
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

    /**
     *
     */
}
