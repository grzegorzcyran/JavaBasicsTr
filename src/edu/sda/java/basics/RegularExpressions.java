package edu.sda.java.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {

        //definition of pattern we want to find
        Pattern pattern = Pattern.compile("xy");

        //check if this definition is found in given input
        Matcher matcher = pattern.matcher("uwxyz");
        System.out.println("Exact match: " + matcher.matches());
        System.out.println("Pattern found: " + matcher.find());

        System.out.println("abcd");
        String sampleString = "abcd";
        //we use same pattern definition and apply it to another string
        Matcher another = pattern.matcher(sampleString);
        System.out.println(another.find());

    }
}
