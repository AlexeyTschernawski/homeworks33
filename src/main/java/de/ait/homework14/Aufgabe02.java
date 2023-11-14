package de.ait.homework14;

import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe02 {
    public static void main(String[] args) {
        /**
         Create an ArrayList that contains several
         * duplicate elements.
         * Write code that removes duplicates from a list.
         * Display the edited list on the screen.
         */
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> fruitsNew = new ArrayList<>();
        boolean newInput = true;
        while (newInput) {
            System.out.println(" Enter a fruit");
            String fruit = scanner.next();
            fruits.add(fruit);
            System.out.println(" Would You like to enter the next position? Enter y to continue and n to stop.");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("n")) {
                newInput = false;
            }
            for (String fruitWare : fruits) {
                if (!fruitsNew.contains(fruitWare)) {
                    fruitsNew.add(fruitWare);
                }
            }
            System.out.println(fruitsNew);
        }

        //#2
        ArrayList<Integer> numbers = new ArrayList<>();
        //create duplicates and elements in our array
        for (int i = 1; i <= 7; i++) {
            numbers.add(i);
        }
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(6);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < numbers.size(); i++) { //go through all indexes
            Integer currentNum = numbers.get(i); //we take each number separately and then do with it what is in the inner loop
            for (int j = i + 1; j < numbers.size(); j++) { //the inner loop works with a number and compares each next number in the array for duplicates
                if (currentNum.equals(numbers.get(j))) { //if the test number matches the number in the array
                    numbers.remove(j); //the encountered number is deleted
                    j--; // shift indexes after deletion
                }
            }
        }
        System.out.println();
        for (int num : numbers) { //print each number separately in a line
            System.out.print(num + " ");
        }
    }

}
