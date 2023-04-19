package edu.sda.java.basics;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String text1 = "aaa";
        String text2 = "aaa";
        //both of above will point to same place in String Pool part of memory

        var text3 = "AAA"; //var keyword allows Java to guess what type of variable it is

        System.out.print("Comparing strings:");
        System.out.println(text1.equals(text2));
        System.out.print("Comparing strings:");
        System.out.println(text1.equals(text3));

        System.out.print("Comparing strings:");
        System.out.println(text1.equalsIgnoreCase(text3));

        text3 = "BBB"; //this will not remove "AAA" string from String Pool -> it stays there, just that text3 returns new value
        System.out.println(text3);

        System.out.println("=============");
        String textMixed = "Some mixed Text";
        System.out.println(textMixed);
        System.out.println(textMixed.toLowerCase());
        System.out.println(textMixed.toUpperCase());

        System.out.println("Position of \"mi\" is: " + textMixed.indexOf("mi"));

        System.out.println("======================");
        System.out.println("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);


        String concat = "Miała matka syna";
        System.out.println(concat);
        String[] words = concat.split(" ");
        for (String word : words) {
            System.out.println(word + "!!");
        }
        System.out.println("======================");
        String[] letters = concat.split("");
        String back = "";
        for (String letter : letters) {
            System.out.println("Sign: " + letter);
            back.concat(letter);
        }

        /**
         * Write a program that reads a line from input
         * Then print only these words from it that start with capital letter
         */
    }
}
