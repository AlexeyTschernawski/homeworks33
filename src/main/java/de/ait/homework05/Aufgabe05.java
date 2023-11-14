package de.ait.homework05;

import java.util.Scanner;

public class Aufgabe05 {
    /*
    Write a program that takes a number as input and checks whether
     is it “lucky” (a lucky number is the number
     the sum of the digits in the first half of which is equal to the sum of the digits in the second half).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number :");
        String numberString = scanner.next();

        int numberLength = numberString.length();

        boolean result;

        if (numberLength % 2 != 0) {
            System.err.println("Validation impossible, invalid number " + numberString);
        } else {//"1234"-->numberString.charAt(0)-->'1'  --->Integer.valueOf("1")-->1
            char firstChar = numberString.charAt(0);
            int numberIntIndex0 = Integer.valueOf(firstChar);
            int numberIntIndex1 = Integer.valueOf(numberString.charAt(1));
            int numberIntIndex2 = Integer.valueOf(numberString.charAt(2));
            int numberIntIndex3 = Integer.valueOf(numberString.charAt(3));

            result = (numberIntIndex0 + numberIntIndex1) == (numberIntIndex2 + numberIntIndex3);

            System.out.println(result);
        }
    }
}
