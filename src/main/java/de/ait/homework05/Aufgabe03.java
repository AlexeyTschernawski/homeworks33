package de.ait.homework05;

import java.util.Scanner;

public class Aufgabe03 {

    public static void main(String[] args) {
        /*
         Write a program that checks
          Is one given number divisible by another without a remainder?
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("inter number 1:");
        int numberOne = scanner.nextInt();
        System.out.print("inter number 2:");
        int numberTwo = scanner.nextInt();

        if (numberTwo == 0) {
            System.err.println("/ 0");
        } else {
            boolean result = numberOne % numberTwo == 0;
            System.out.println(result);
        }
    }
}
