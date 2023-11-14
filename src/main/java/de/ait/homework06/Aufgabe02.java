package de.ait.homework06;

import java.util.Scanner;

public class Aufgabe02 {
    public static void main(String[] args) {
        /*
        Write a program that takes a number as input
          and displays the sum of its digits. 1234-->10
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        String numberString = scanner.next();
        // 1 2 3 4
        int sum = 0;
        for (int i=0; i<=numberString.length()-1; i++ )
        {
            char numberChar = numberString.charAt(i);
            System.out.println(numberChar);
            int numberInt = Character.getNumericValue(numberChar);
            sum = sum + numberInt;
            System.out.println("Sum: " + sum);
        }
        System.out.printf("The sum of the digits of the number %s is %d ", numberString, sum);


        //#2
        int summa = 0;
        for(int i = 0; i < numberString.length(); i++) {
            int digit = 0;
            switch(numberString.charAt(i)) {
                case '0' -> digit = 0;
                case '1' -> digit = 1;
                case '2' -> digit = 2;
                case '3' -> digit = 3;
                case '4' -> digit = 4;
                case '5' -> digit = 5;
                case '6' -> digit = 6;
                case '7' -> digit = 7;
                case '8' -> digit = 8;
                case '9' -> digit = 9;
                default -> {
                    System.out.println("Unrecognized symbol. Exiting");
                    System.exit(0);
                }
            }
            summa = summa + digit;
        }
        System.out.println("sum numbers = " + summa);
        scanner.close();
    }
}
