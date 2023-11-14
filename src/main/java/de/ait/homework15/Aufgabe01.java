package de.ait.homework15;

public class Aufgabe01 {
    /*
     * Write a method that accepts
     * two integers and returns their sum.
     */
    public static void main(String[] args) {
        System.out.println(sum(10, 15));
        sumVoid(10, 30);
    }

    static int sum(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    static void sumVoid(int numberOne, int numberTwo){
        int result = numberOne + numberTwo;
        System.out.println(result);
    }

}
