package de.ait.homework12;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe04 {


    public static void main(String[] args) {
        /*
        Given a sorted array and a target number.
         Write a program that determines
         Is it possible to get this amount?
         taking two numbers from the array.
         Return the indices of these numbers..
         */

        int[] numbers = {1, 2, 4, 7, 11,5};
        int target = 9;

        int left = 0;
        int right = numbers.length - 1;

        boolean found = false;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                System.out.println("Indexes: " + left + " and " + right);
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("A pair of numbers with this sum was not found.");
        }

        //#2
        Scanner scan = new Scanner(System.in);
        int[] array = new int[]{1, 3, 4, 2, 6, 2, 7, 8, 9, 0, -2};
        Arrays.sort(array);
        System.out.println("our array");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d  ", array[i]);
        }
        System.out.println("\n");
        System.out.println("input number");
        int num = scan.nextInt();
        System.out.println("\n");
        int counter = 0;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[j] + array[i] == num) {
                    if (j == 0) {
                        System.out.printf("The sum %d is given by the array elements with indexes: \n", num);
                    }
                    System.out.printf("%d %d\n", j, i);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("No such numbers found");
        }
    }
}
