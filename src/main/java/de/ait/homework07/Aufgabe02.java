package de.ait.homework07;

import java.util.Scanner;

public class Aufgabe02 {
    public static void main(String[] args) {
        /*
        Write a program that takes a number N and calculates the sum of all numbers from 1 to N,
          using a loop. Example: the number 10 is entered.
          The console displays (10+9+8+7+6+5+4+3+2+1): “Sum of numbers is 55”
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int number = scanner.nextInt();

        int sum = 0;

        for(int i=1; i <= number; i++){
            sum = sum + i;
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
            System.out.println("--------");
        }
        System.out.println("---------------------------");
        System.out.println("The sum of its numbers is equal: " + sum);
    }
}
