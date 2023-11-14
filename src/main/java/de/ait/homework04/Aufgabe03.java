package de.ait.homework04;

import java.util.Scanner;

public class Aufgabe03 {
    public static void main(String[] args) {

        /*
        Develop a "guess the number game." The computer guesses a number from 1 to 5,
         and the user must guess this number. If the user enters a number,
         which is larger than the guess, the program displays “too large”.
         If the user enters a number that is less than the guessed number,
         The program outputs "too small". If the user guesses the number,
         The program displays "Congratulations, you guessed the number!". Use if-else to compare numbers.
         */

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("inter number 1-5 ");
        number = scanner.nextInt();

        int max = 5;
        int min = 1;

        int numberComputer = (int) ((Math.random() * (max - min)) + min);

        switch (number){
            case 1 -> {
                if (numberComputer == 1){
                    System.out.println("Congratulations, you have guessed the number!");
                }
                else if (numberComputer > number)  {
                    System.out.println("Computer number is greater " + numberComputer);
                }

            }
            case 2 -> {
                if (numberComputer == number){
                    System.out.println("Congratulations, you have guessed the number!");
                }
                else if (numberComputer > number)  {
                    System.out.println("computer number is greater " + numberComputer);
                }
                else {
                    System.out.println("computer number is less " + numberComputer);
                }

            }
            case 3 -> {
                if (numberComputer == 3){
                    System.out.println("Поздравляем, вы угадали число!");
                }
                else if (numberComputer > number)  {
                    System.out.println("Число компьютера больше " + numberComputer);
                }
                else {
                    System.out.println("computer number is less  " + numberComputer);
                }
            }
            case 4 -> {
                if (numberComputer == 4){
                    System.out.println("Congratulations, you have guessed the number!");
                }
                else if (numberComputer > number)  {
                    System.out.println("computer number is greater " + numberComputer);
                }
                else {
                    System.out.println("computer number is less  " + numberComputer);
                }
            }
            case 5 -> {
                if (numberComputer == number){
                    System.out.println("Congratulations, you have guessed the number!");
                }
                else {
                    System.out.println("computer number is less  " + numberComputer);
                }
            }

                default -> System.err.println("error");
        }

        // option 2
        if (numberComputer == number){
            System.out.println("Congratulations, you have guessed the number!");
        }
        else if (number >= 1 && number >= 5 && numberComputer > number){
            System.out.println("computer number is greater " + numberComputer);

        }
        else if (number >= 1 && number >= 5 && numberComputer < number){
            System.out.println("computer number is less  " + numberComputer);

        }
        else {
            System.err.println("error");
        }


    }
}
