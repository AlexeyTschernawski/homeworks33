package de.ait.homework17;

import java.util.Scanner;

public class Aufgabe01 {
    public static void main(String[] args) {
        /*
         * Create a method
         * which outputs a table
         * multiplication for a given number.
         */
        int numberToMultiplication = readNumber();
        if (numberToMultiplication == 0) {
            System.err.println("Incorrect value: " + numberToMultiplication);
        } else {
            printMultiplicationTable(numberToMultiplication);
        }
    }

    static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter the number (1-10):");
        number = scanner.nextInt();
        if (number >= 1 && number <= 10) {
            scanner.close();
            return number;
        } else {
            System.err.println("Achtung! You entered an incorrect value!");
            scanner.close();
            return 0;
        }

    }


    static void printMultiplicationTable(int number) {
        System.out.println("\nMultiplication table for number " + number + ":\n");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }

}
