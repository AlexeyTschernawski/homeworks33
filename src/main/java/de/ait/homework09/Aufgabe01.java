package de.ait.homework09;

import java.util.Scanner;

public class Aufgabe01 {
    public static void main(String[] args) {
        /*
     Write a program that prints a string in reverse order.
         Your program should go through the entire line from the end to the beginning and
         display it on the screen.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: "); // prüfe was für Input
        String stroka=scanner.nextLine();
        //Hallo
        //01234
        System.out.println("Result: ");
        for(int i=stroka.length()-1; i>=0; i--){
            char letter = stroka.charAt(i);
            System.out.printf("%s", letter);
        }
        System.out.println("");
    }
}
