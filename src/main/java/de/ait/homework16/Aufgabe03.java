package de.ait.homework16;

import java.util.ArrayList;

public class Aufgabe03 {
    /*
    Task 3: Create a method that accepts an array of integers and
    returns the arithmetic mean of these numbers.
        */
    public static void main(String[] args) {

    double average = calculateAverage();
        System.out.println("Average: " + average);
}

    static double calculateAverage() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }
}
