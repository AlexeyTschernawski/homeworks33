package de.ait.homework06;

import java.util.Scanner;

public class JavaAufgabeWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter numbers (enter 000 to complete):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("000")) {
                break;
            }

            int number = Integer.parseInt(input);
            sum += number;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average value: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
    }
    }
















