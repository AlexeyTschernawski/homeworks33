package de.ait.homework07;

import java.util.Scanner;

public class Aufgabe03 {
    public static void main(String[] args) {
        /*
        Write a program that accepts a sequence of numbers from the user
         (the quantity is not known in advance)
         and calculates their average.
         The user himself determines when to stop entering numbers and display the average
          value for those already entered by entering 000.
          Example: The user enters "10", "20", "30", "000" from the keyboard.
          Console input: "Average value 20"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int countNumber = 0;
        double result = 0;

        while (number != 0) {
            sum = sum + number;
            countNumber++;
            System.out.println(" number: " + number);
            System.out.println("sum: " + sum);
            System.out.println("countNumber: " + countNumber);
            System.out.print("input next number: ");
            number = scanner.nextInt();
            //countNumber = countNumber+1
            System.out.println("----------------" + countNumber);
        }
        if (countNumber == 0) {
            System.err.println("no number intered");
        } else {
            result = (double) sum / countNumber;
            System.out.println("average number: " + result);
        }
    }
}









