package de.ait.homework12;

import java.util.Random;
import java.util.Scanner;

public class Aufgabe03 {
    public static void main(String[] args) {
        /*
         * Create a program that simulates a coin toss.
         * The user enters how many times he wants to flip the coin,
         * and the program counts and shows how many times heads and tails fell. Use do-while to repeat the experiment until the user decides to quit.
         */
        Scanner scan = new Scanner(System.in);
        int numberOfCoinTosses;
        int max = 10; //eagle 6-10;
        int min = 1; // tails 1-5
        int countpEagle = 0;
        int counttails = 0;
        boolean flag = false;

        do {
            System.out.println("How many times do you want to toss a coin?: ");
            numberOfCoinTosses = scan.nextInt();
            for (int i = 1; i <= numberOfCoinTosses; i++) {
                int result = (int) (Math.random() * (max - min) + min);
                if (result > 5) {
                    countpEagle++;
                } else if (result <= 5) {
                    counttails++;
                }
            }
            System.out.println("Do you want to flip the coin again or end the game?.\n Enter 1 If you want to continue the game " +
                    "or Lead any other number if you want to end the game");
            int resultend = scan.nextInt();
            if (resultend == 1) {
                flag = true;
            } else if (resultend != 1) {
                flag = false;
            }
        } while (flag);

        System.out.printf("\nResult: Eagle - %d, tails - %d", countpEagle, counttails);



        Random random =new Random();
        System.out.println("To continue, press Enter");
        int orel=0;
        int reshka=0;
        int i=0;
        do {
            int randomNumber =random.nextInt(2);
            System.out.println("The process is running");
            System.out.println("Press q to stop the process");
            if(randomNumber==1)
            {
                orel++;
            }
            else
            {
                reshka++;
            }
            i++;
            System.out.println(i);
        }
        while(!scan.nextLine().equals("q"));
        System.out.println("pricess stoped");
        System.out.printf("It came up as: " + orel +" eagle and " + reshka + " nut");

    }
}
