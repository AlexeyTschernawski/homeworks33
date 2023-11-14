package de.ait.homework18;

public class Aufgabe03 {
    public static void main(String[] args) {
        /*
        Create a method that takes
        variable number of double arguments
        and returns their average.
         */
        double average1 = calculateAverage(1.0, 2.0, -3.0);
        System.out.println("Average value 1: " + average1);
        System.out.println();
        double average2 = calculateAverage(4.0, 5.0, 6.0, 7.0);
        System.out.println("Average value 2: " + average2);
        System.out.println();
        double average3 = calculateAverage();
        System.out.println("Average value 3: " + average3);
        System.out.println();
        double average4 = calculateAverage(Double.MAX_VALUE,  Double.MAX_VALUE);
        System.out.println("Average value 4: " + average4);
        System.out.println();
        double average5 = calculateAverage( Double.MIN_VALUE,  Double.MIN_VALUE,
                 Double.MIN_VALUE,  Double.MIN_VALUE, Double.MIN_VALUE);
        System.out.println("Average value 5: " + average5);
        System.out.println();

        double average6 = calculateAverage(null);
        System.out.println("Average value 6: " + average6);
        System.out.println();
    }

    public static double calculateAverage(double... numbers) {
        if (numbers == null || numbers.length == 0) {
            System.err.println("The average cannot be calculated for an empty list of numbers.");
            return 0.0; // Return 0.0 in case of error or empty list of numbers
        }
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

}
