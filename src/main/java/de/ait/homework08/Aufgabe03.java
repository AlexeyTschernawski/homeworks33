package de.ait.homework08;

import java.util.Scanner;

public class Aufgabe03 {

    /**
     Write a simple game in which the computer guesses a number from 1 to 100,
     and the user tries to guess it. Use a do-while loop to repeat the game,
      until the user guesses the number.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = 100;
        int min = 1;
        int computerNumber = (int) ((Math.random()* (max - min)) + min);
        int myTry;
        do {

            System.out.print("The computer guessed a number from 1 to 100: ");
            myTry = scanner.nextInt();
            if (computerNumber != myTry) {
                System.out.println("You didn't guess correctly, try again.");
                //System.out.println("computer guessed: " + computerNumber);
            }
        }
        while (computerNumber != myTry);
        System.out.println("You guessed it right !!!");



    }
}

