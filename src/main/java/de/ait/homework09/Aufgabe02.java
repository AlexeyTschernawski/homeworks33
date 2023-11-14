package de.ait.homework09;

import java.util.Scanner;

public class Aufgabe02 {
    public static void main(String[] args) {
        /*
        Implement a program that raises a number to a power
          without using the built-in Math.pow() function.
          Try implementing a fast exponentiation algorithm
          to improve efficiency.
         */
        Scanner scan =new Scanner(System.in);
        int result=1;
        System.out.println("input number");
        int number= scan.nextInt();
        System.out.println("enter degree >= 0");
        int exponent=scan.nextInt();
        if(exponent < 0){
            System.err.println(" The degree must not be negative");
        }
        else {
            for (int i = 0; i < exponent; i++) {
                result *= number;
            }
            System.out.printf("%d", result);
        }
    }

}
