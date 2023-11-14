package de.ait.homework17;

import java.util.ArrayList;

public class AufgabeJavaMethods {

    public static void main(String[] args) {
        printNumbers(10, 20, 30);

    }

    //A recursive method is a method that calls itself within its body.
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Using the varargs mechanism, you can pass an arbitrary number of arguments of the same type.
    public static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static ArrayList<String> contArrays(ArrayList<String>... arrayLists) {
    return null;
    }


    static void addDelimiter(ArrayList<String> stringsArray) {
        stringsArray.add("-----");
    }

    static ArrayList<String> createArrayList() {
        ArrayList<String> listToReturn = new ArrayList<>();
        listToReturn.add("Test");
        return listToReturn;
    }

    static boolean isValid(ArrayList<String> stringsArray) {
        return stringsArray.size() != 0;

    }
}
