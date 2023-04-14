package edu.sda.java.basics;

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
    }
}
