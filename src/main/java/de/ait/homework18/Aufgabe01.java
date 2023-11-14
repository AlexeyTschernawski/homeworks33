package de.ait.homework18;

public class Aufgabe01 {
    public static void main(String[] args) {
        /*
       Create a method that takes a variable
       the number of arguments of type int and returns their sum.
         */
        int[] numbers = {12, 20, 35, 47, 55};
        int resultSumNull = printSumOfNumbers(numbers);
        if(resultSumNull == 0){
            System.err.println("Check the arguments passed to the method");
        }
        else {
            System.out.println("Sum of numbers: " + resultSumNull);
        }
    }

    static int printSumOfNumbers(int... numbers) {
        int sum = 0;
        if(numbers == null || numbers.length == 0){
            return sum;
        }
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
