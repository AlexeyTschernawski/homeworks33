package de.ait.homework16;

import java.util.Scanner;

public class Aufgabe01 {
    public static void main(String[] args) {
        /*
         * Write a method that accepts two numbers
         * and the operation symbol (+, -, *, /) and returns the result of this operation.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number to calculate: ");
        double userNum1 = scanner.nextDouble();
        System.out.println("Enter operation on numbers to calculate: ");
        char operation = scanner.next().charAt(0);
        System.out.println("Enter second number to calculate: ");
        double userNum2 = scanner.nextDouble();

        double result = calculate(userNum1, operation, userNum2);
        System.out.println("Result: " + result);

        double result01 = operationWithNumbers('/',3,9);
        System.out.println(result01);


    }
    static double calculate(double num1, char operation, double num2) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {  // Checking division by zero
                    return num1 / num2;
                } else {
                    System.err.println("Error: dividing by zero");
                }
            default:
                System.err.println("Error: Invalid operation");
                return 0.0;
        }
    }


    public static double operationWithNumbers(char operationSymbol, double number01, double number02  ) {
        double result = 0.00;
        if (operationSymbol == '+') {
            result = number01 + number02;
        }
        else if (operationSymbol == '-') {
            result = number01 - number02;
        }
        else if (operationSymbol == '*') {
            result = number01 * number02;
        }
        else if (operationSymbol == '/') {
            if(number02 == 0){

                System.err.println("Error: dividing by zero");
                return 0.0;
            }
            result = number01 / number02;
        }
        return result;
    }
}
