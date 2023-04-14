package edu.sda.java.basics;

public class Operators {
    public static void main(String[] args) {
        int first = 10;
        int second = 2;
        System.out.println(first + second);
        System.out.println(first - second);
        System.out.println(first * second);
        System.out.println(first / second);
        System.out.println(first % second);

        first += 2; // it's like first = first + 2;
        first -= 2; // it's like first = first - 2;
        first *= 2; // it's like first = first * 2;
        first /= 2; // it's like first = first / 2;
        first %= 2; // it's like first = first % 2;

        System.out.println("=========================");
        /**
         * ++ operator and variable
         * variable++ -> FIRST do sth with variable ane THEN increment (add 1)
         * ++variable -> FIRST increment THEN do something
         * in our case do sth means "print on screen"
         */
        int increment = 3;
        System.out.println(increment); //3 expected
        System.out.println(increment++); // 3 expected
        System.out.println(increment); // 4 expected
        System.out.println(++increment); // 5 expected

        System.out.println("=========================");
        int decrement = 3;
        System.out.println(decrement); //3 expected
        System.out.println(decrement--); // 3 expected
        System.out.println(decrement); // 2 expected
        System.out.println(--decrement); // 1 expected

        System.out.println("=======================");
        System.out.println("Comparing");
        int a = 1;
        int b = 1;
        int c = 2;
        System.out.println("Is a equal to b? : " + (a == b));
        boolean check = a == c;
        System.out.println("Is a equal to c? : " + check);

        System.out.println("=======================");
        System.out.println("Is a greater then b? : " + (a > b));
        System.out.println("Is a greater or equal then b? : " + (a >= b));
        System.out.println("Is a less then b? : " + (a < b));
        System.out.println("Is a less or equal then b? : " + (a <= b));

        System.out.println("Is a not equal to b? : " + (a != b));

        System.out.println("=============================");
        System.out.println("Logical operators");
        boolean firstBool = true;
        boolean secondBool = false;

        System.out.println("Logical and: " + (firstBool && secondBool));
        System.out.println("Logical or: " + (firstBool || secondBool));
        System.out.println("Logical negation: " + !firstBool);

    }
}
