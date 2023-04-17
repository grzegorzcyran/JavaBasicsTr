package edu.sda.java.basics.classes;

import edu.sda.java.basics.classes.inner.Gender;

import static edu.sda.java.basics.Gender.className;

public class HumanAppSample {

    public static void main(String[] args) {

        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("Agnieszka");
        human1.setSurname("Wolska");
        Gender gender = new Gender();
        gender.setGenderName("female");
        human1.setGender(gender);

        Human human2 = new Human();
        human2.setAge(45);
        human2.setSurname("Kowalski");
        human2.setName("Olgierd");
        edu.sda.java.basics.Gender gender2 = new edu.sda.java.basics.Gender();
        gender2.setGenderName("male");
        //human2.setGender(gender2); thst is impossible, Human expects Gender but from different package
        System.out.println("Using static import: " + className);

        System.out.println(human1.printInfo());
        System.out.println("Using getter: " + human1.getSurname());

        System.out.println(human2.printInfo());
        System.out.println("Using getter: " + human2.getName());

        //static field can be accessed from CLASS, no object required
        System.out.println(Human.classInfo);
        //calling same field from object is possible but not supported by IDE - it does not get hinted
        System.out.println(human1.classInfo);
        System.out.println(human2.classInfo);

        //field accessed only in this package, hidden for other packages
        System.out.println(human1.pachagePrivateString);

        Human human3 = new Human("Janina", "Braciak");
        Human human4 = new Human("Piotr", "Braciak", 53);
        Human.Eye eyeLeft = human4.new Eye("left"); //calling constructor of inner class from the outside
        Human.Eye eyeRight = human4.new Eye("right");
        Human.Eye[] eyes = new Human.Eye[]{eyeLeft, eyeRight};
        human4.setEyes(eyes);



    }
}
