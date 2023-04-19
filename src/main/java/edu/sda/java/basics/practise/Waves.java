package edu.sda.java.basics.practise;

import java.util.Scanner;

public class Waves {

    public static void main(String[] args) {

        System.out.println("Please set length of the wave:");
        Scanner scanner = new Scanner(System.in);
        int waveLength = scanner.nextInt();

        String[] row1 = new String[]{"*", " ", " ", " ", " ", " ", " ", "*"};
        String[] row2 = new String[]{" ", "*", " ", " ", " ", " ", "*", " "};
        String[] row3 = new String[]{" ", " ", "*", " ", " ", "*", " ", " "};
        String[] row4 = new String[]{" ", " ", " ", "*", "*", " ", " ", " "};

        String row1Concat = "";
        String row2Concat = "";
        String row3Concat = "";
        String row4Concat = "";
        int column = 0;
        while (waveLength > 0) {
            row1Concat += row1[column];
            row2Concat += row2[column];
            row3Concat += row3[column];
            row4Concat += row4[column];

            waveLength--;
            column ++;
            if(column >= row1.length) {
                column = 0;
            }
        }

        System.out.println(row1Concat);
        System.out.println(row2Concat);
        System.out.println(row3Concat);
        System.out.println(row4Concat);
    }
}
