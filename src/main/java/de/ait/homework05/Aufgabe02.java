package de.ait.homework05;

import java.util.Scanner;

public class Aufgabe02 {
    public static void main(String[] args) {

        /*
         Write a program that takes three numbers and outputs true,
          if the sum of the squares of the first two is equal to the square of the third.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("inter number 1:");
        int numberOne = scanner.nextInt();
        System.out.print("inter number 2:");
        int numberTwo = scanner.nextInt();
        System.out.print("inter number 3:");
        int numberTree = scanner.nextInt();
        boolean result = true;

        if ((numberOne * numberOne + numberTwo * numberTwo)
                != (numberTree * numberTree)) {
            result = false;
        }

        System.out.println(result);


    }
}
