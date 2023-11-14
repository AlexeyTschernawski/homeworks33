package de.ait.homework10;

public class Aufagbe04 {
    public static void main(String[] args) {
        /*
        Write a program
         which returns the sum of all
         array elements.
         */
        int[] array = {5, 10, 15, 20, 25};

        int sum = 0;

        for (int i=0; i< array.length; i++) {
            sum += array[i]; //sum = sum + array[i];
        }

        System.out.println("Sum of all array elements: " + sum);
    }
}
