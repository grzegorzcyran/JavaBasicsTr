package edu.sda.java.basics;

public class Conditions {

    public static void main(String[] args) {
        int a = 10;
        //The condition below will most probably be removed from
        //compiled code as Java compiler will detect that it never works
        if(a > 10) {
            System.out.println(" A is greater then 10");
        }

        if(a > 9) {
            System.out.println(" A is greater then 9");
        }

        if(a > 20) {
            System.out.println("A is greater then 20");
        } else {
            System.out.println("A is less then 20");
        }

        if(a > 200) {
            System.out.println("A greater then 200");
        } else if (a > 100) {
            System.out.println("A greater then 100");
        } else {
            System.out.println("A not so great");
        }

        if(a > 400) {
            System.out.println("A greater then 400");
        } else if (a > 300) {
            System.out.println("A greater then 300");
        }

        System.out.println("==========================");
        System.out.println("==========================");
        String name = "Robert";
        switch (name) {
            case "Asia" :
                System.out.println("Welcome Asia");
                break;
            case "Robert" :
                System.out.println("Welcome Robert");
                System.out.println("Missing break statement causes program go to next case");
            case "Janek" :
                System.out.println("Welcome Janek");
                break;
            default :
                System.out.println("Default pass");
                System.out.println("Welcome " + name);
        }

        System.out.println("===========================");
        System.out.println("Tenary operator (binary if - else)");
        System.out.println("condition ? operation : other operation");

        boolean checkTenary = false;
        System.out.println(checkTenary ? " It's true! " : " It's false ");

        int toCheck = 100;

        //if toCheck is greater then 1000 then I'll assign 2 to "result" otherwise I'll assign 800
        int result = toCheck > 1000 ? 2 : 800;

        int hell = toCheck > 1 ? toCheck < 300 ? 300 : toCheck == 200 ? 300 : 3 : 2; // PLEASE  do not write such code :)

    }
}
