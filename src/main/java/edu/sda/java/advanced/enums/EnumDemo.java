package edu.sda.java.advanced.enums;

public class EnumDemo {

    public static void main(String[] args) {

        Human human = new Human("Jan", "Kowalski", Gender.MALE);
        Human otherHuman = new Human("Lidia", "Nowak", "f");

        System.out.println(human.getSurname() + " " + human.getGender());
        System.out.println(otherHuman.getSurname() + " " + otherHuman.getGender());
        System.out.println(otherHuman.getSurname() + " " + otherHuman.getGender().getPlTranslation());
    }
}
