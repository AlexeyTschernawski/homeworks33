package de.ait.homework05;

import java.util.Scanner;

public class Aufgabe04 {
    public static void main(String[] args) {
        /*
       Write a program that takes three numbers as input and outputs true,
         if they are ordered in ascending or descending order.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("inter number 1:");
        int numberOne = scanner.nextInt();
        System.out.print("input number 2:");
        int numberTwo = scanner.nextInt();
        System.out.print("inter number 3:");
        int numberTree = scanner.nextInt();

        boolean result = false;

        if ((numberTwo > numberOne && numberTwo < numberTree)
                || (numberTwo < numberOne && numberTwo > numberTree)) {
            result = true;
        }
        System.out.println(result);

    }
}
