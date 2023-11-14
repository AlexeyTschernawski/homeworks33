package de.ait.homework06;

import java.util.Scanner;

public class Aufgabe01 {
    public static void main(String[] args) {
        /*
        Write a program that takes a number as input and
        outputs it in reverse order. 11223344-->44332211
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        String numberString = scanner.nextLine();

        int lengthOfNumber = numberString.length();
        System.out.print("Number in reverse order :");
        //123456  654...
        for (int i = lengthOfNumber-1; i >=0; i--){
            System.out.print(numberString.charAt(i));
        }

    }
}
