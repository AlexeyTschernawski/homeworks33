package de.ait.homework07;

import java.util.Scanner;

public class Aufgabe01 {

    /*
     Write a program that finds the minimum and maximum digit
       in the number entered from the keyboard using cycles. Example: enter the number 5987.
       The console displays: “minimum digit 5, maximum 9.”
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int number = scanner.nextInt();

        int minDigit = 9;
        int maxDigit = 0;

        while (number > 0){
            int digit = number%10;
            System.out.println("digit = " + digit);
            if(digit < minDigit){
                minDigit = digit;
            }
            if(digit > maxDigit){
                maxDigit = digit;
            }
            number = number/10;
            System.out.println("number: " + number);
            System.out.println("---------------------");
        }
        System.out.println("Max: " + maxDigit + " Min:" + minDigit);
    }
}
