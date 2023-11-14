package de.ait.homework09;

public class Aufgabe04 {
    public static void main(String[] args) {
        /*
         * Write a program that prints the multiplication tables for numbers from 1 to 10.
         * Try implementing this using nested loops.
         */
        /**System.out.print("  ");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d", i);
            for (int j = 1; j <= 10; j++) {
                int math = i * j;
                System.out.printf("%4d", math);
            }
            System.out.println();
        }*/

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t\t");
            }
            System.out.println();
        }

    }
}
