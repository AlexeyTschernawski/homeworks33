package de.ait.homework04;

import java.util.Scanner;

public class Aufgabe02 {
    public static void main(String[] args) {

        /*
         Write a program that accepts a string.
          If the string is "Hello", the program should respond with "Hello!".
          If the string is "Bye", the program should respond with "See you later!"
          If the string is not equal to either of these options, the program should respond with "I don't understand you."
          Implement this with switch-case and if-else
         */

        String greet;
        String answer = "i don't understand you";

        Scanner scanner = new Scanner(System.in);
        System.out.print("inter word");
        greet = scanner.next();

        switch (greet) {
            case "hello"-> answer = "Hello";
            case "Hello"-> answer = "see you, bye!";
            default -> System.err.println("error!!!");
        }
        System.out.println(answer);

    }
}
