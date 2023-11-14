package de.ait.homework06;

import java.util.Scanner;

public class Aufgabe03 {
    public static void main(String[] args) {
        /*
        Write a program that takes a number as input
          n and prints all prime numbers up to n.
          10-->1,3,5,7
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int numberInt = scanner.nextInt();

        if(numberInt <= 0){
            System.err.println("The number must be positive");
        }
        else {

            for (int i=2; i<numberInt-1; i++){
            boolean result = true;
                for (int y=2; y <= 1+i/2; y++ ){
                    if(i % y == 0){
                        result = false;
                        break;
                    }
                }
                if(result){
                    System.out.printf("%d ", i);
                }

            }
        }


        //#2
        int checkNumber;
        boolean result=true;

        for (int i=2; i<=numberInt/2; i++) {
            checkNumber = numberInt % i;
            if (checkNumber == 0) {
                result = false;
                break;
            }
            //TODO Displaying numbers on the screen
        }
        if(result) {
            System.out.println(numberInt + " - prime number");
        } else {
            System.out.println(numberInt + " - composite number");
        }
    }
}
