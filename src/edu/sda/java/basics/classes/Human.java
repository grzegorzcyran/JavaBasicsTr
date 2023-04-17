//package is expected to appear in first code line
//import java.util.Scanner;

//comment is fine
package edu.sda.java.basics.classes;

import edu.sda.java.basics.classes.inner.Gender;

public class Human {

    public static String classInfo = "Human class";

    //private fields - USUALLY
    private String name;
    private String surname;
    private int age;

    private Gender gender;

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

    //some printInfo method
    public String printInfo() {
        return "Name: " + name + ", surname: " + surname + " and age: " + age;
    }

    //private method - to be used only inside this class
    private void info() {
        System.out.println("working in setter");
    }

}
