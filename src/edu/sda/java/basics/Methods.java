package edu.sda.java.basics;

public class Methods {

    //method that does not return anything and
    //not accept any argument
    void someCall() {
        System.out.println("No args pass, nothing is returned!");
    }

    //method not returning anything, but accepting two args
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    //method returning sth but not accepting args
    int random() {
        return 7;
    }

    //method returning sth and accepting args
    int addAndReturn(int a, int b) {
        return a + b;
    }

    //return in this method is used to break execution on given condition
    void doNothingIf2(int arg) {
        if(arg == 2) {
            return;
        }
        System.out.println(arg);
    }



}
