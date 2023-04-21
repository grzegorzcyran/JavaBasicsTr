package edu.sda.java.advanced.reflection;

public class Person {

    private String name;
    protected String familyName;
    String surname;
    public int age;

    private Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("Info : " + info());
        return age;
    }

    private String info() {
        return Person.class.getPackageName();
    }
}
