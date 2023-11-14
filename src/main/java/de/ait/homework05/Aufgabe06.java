package de.ait.homework05;

import java.util.Scanner;

public class Aufgabe06 {

    public static void main(String[] args) {
        /*
         Write a program that takes a three-digit number as input and checks whether
           is this number "narcissistic"
           (a narcissistic number to the power of n is equal to itself;
           for example n=3, 153 = 1^3 + 5^3 + 3^3).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        int firstDigit = number / 100;
        int secondDigit = (number % 100) / 10;
        int thirdDigit = number % 10;

        int result = (int) (Math.pow(firstDigit, 3) + Math.pow(secondDigit, 3) + Math.pow(thirdDigit, 3));

        if (number == result) {
            System.out.println("number " + number + " is narcissistic");
        } else {
            System.out.println("number " + number + " is not narcissistic");
        }
    }
}
