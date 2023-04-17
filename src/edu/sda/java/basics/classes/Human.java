//package is expected to appear in first code line
//import java.util.Scanner;

//comment is fine
package edu.sda.java.basics.classes;

import edu.sda.java.basics.classes.inner.Gender;

public class Human {

    public static String classInfo = "Human class";

    String pachagePrivateString = "Package private info";

    //private fields - USUALLY
    private String name;
    private String surname;
    private int age;

    private int noOfChildren;

    private Gender gender;

    private Eye[] eyes;

    //Inner class - usually strictly connected "by logic" to outer class
    public class Eye {
        private String eye;

        public Eye(String eye) {
            this.eye = eye;
        }

        public String getEye() {
            return eye;
        }
    }

    /**
     * If we do not create any constructor, there still is one available: constructor without params,
     * in our case Human()
     * If we create any constructor, java does not provide us with this default one
     * We need that constructor for code to compile, we need to add it oursenves
     */

    //constructor with 2 out of 3 fields
    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    //We can have one or more constructors, each with different set of parameters
    public Human(String name, String surname, int age) {
//        this.name = name;
//        this.surname = surname;
        this(name, surname);
        this.age = age;
    }

    //we cannot have second constructor with parameters identical to above: String, String, int
//    public Human(String name, String surname, int noOfChildren) {
//
//    }

    public Human(String name, String surname, int age, Gender gender) {
        this(name, surname, age); // passing 3 fields to another constructor
        this.gender = gender;
    }

    public Human() {

    }

    //GETTERS and SETTERS public
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        info();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        info();
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Eye[] getEyes() {
        return eyes;
    }

    public void setEyes(Eye[] eyes) {
        this.eyes = eyes;
    }

    //some printInfo method
    public String printInfo() {
        return "Name: " + name + ", surname: " + surname + " and age: " + age;
    }

    //private method - to be used only inside this class
    private void info() {
        System.out.println("working in setter");
    }

}
