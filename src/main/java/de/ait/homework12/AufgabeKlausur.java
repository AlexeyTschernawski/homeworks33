package de.ait.homework12;

import java.util.ArrayList;
import java.util.Random;

public class AufgabeKlausur {
    /**
     Create a program that will perform the following actions:
     *
     * Adding elements
     * Create an ArrayList to store integers.
     * Fill it with ten random integers from 1 to 100.
     *
     * Removing even numbers
     * Go through the list and remove all even numbers.
     *
     * Output of remaining elements
     * Print the remaining list items to the console.
     *
     * Average value calculation
     * Calculate and output the average of the remaining elements in the list.
     *
     * Random random = new Random();
     * random.nextInt(100) + 1
     */

    public static void main(String[] args) {
        /*
        Adding elements
       Create an ArrayList to store integers.
       Fill it with ten random integers from 1 to 100.
         */
        ArrayList<Integer> numbers = new ArrayList<>();

        ArrayList<String> list = new ArrayList();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            Integer rundomNumber = random.nextInt(100) + 1;
            numbers.add(rundomNumber);
        }

        System.out.println("Original list: " + numbers);

        //Удаление четных чисел
        for (int i=0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;// Index decrease due to shifting of elements after deletion
            }
        }

        //Output remaining elements
        System.out.println("List after removing even numbers: " + numbers);

        //Calculating the average
        int sum = 0;
        for (int num: numbers){
            sum += num;
        }
        if(!numbers.isEmpty()){
            double result = (double) sum/ numbers.size();
            System.out.println("Average value: " + result);
        }
        else {
            System.out.println("the list is empty");
        }
    }
}
