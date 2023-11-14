package de.ait.homework04;

import java.util.Scanner;

public class Aufgabe01 {

    public static void main(String[] args) {
        /*
         * Напишите программу, которая использует switch-case, чтобы реализовать простой калькулятор.
         * Программа должна принимать два числа и операцию (+, -, *, /, ^),
         * а затем выполнять эту операцию и выводить результат.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("inter first number: ");
        int numberOne = scanner.nextInt();
        System.out.print("inter second number: ");
        int numberTwo = scanner.nextInt();

        System.out.print("specify operation (+, -, *, /: ");
        String operation = scanner.next();

        int result= 999;

        switch (operation) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                if (numberTwo != 0) {
                    result = numberOne / numberTwo;
                    break;
                } else {
                    System.err.println("division by 0");
                    break;
                }
            default:
                System.err.println("unavailable operation");
                break;

        }
        if(result != 999) {
            System.out.println("result: " + result);
        }

        //Современная аннотация
        switch (operation) {
            case "/" -> {
                if (numberTwo == 0) {
                    System.err.println("division by 0");
                }
                else result = numberOne/numberTwo;

            }
            default -> System.err.println("error");
        }
        System.out.println("result: " + result);
    }
}
