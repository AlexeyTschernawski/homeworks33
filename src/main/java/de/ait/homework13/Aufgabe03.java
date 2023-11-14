package de.ait.homework13;

import java.util.ArrayList;
import java.util.Arrays;

public class Aufgabe03 {
    public static void main(String[] args) {
        /**
         * Create an ArrayList of numbers: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
         * Get a sublist from this list,
         * which contains only numbers from 4 to 8.
         * Print this sublist.
         */

        //create ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        for (Integer number : numbers) {
            if (number >= 4 && number <= 8) {
                result.add(number);
            }
        }

        System.out.println(result);

        //#2
        ArrayList<Integer> listInt = new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            listInt.add(i);
        }
        System.out.println(listInt);

        for(int i=0;i<listInt.size();i++) {
            if (listInt.get(i) <= 3 || listInt.get(i) > 8) {
                listInt.remove(i);
                i--;
            }
        }
        System.out.println(listInt.size());
        System.out.println(listInt);



        //#3
        Integer[] nummersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> nummersList = new ArrayList<>(Arrays.asList(nummersArray));
        nummersList.add(1, 10);
        int startIndex = nummersList.indexOf(4);
        int endIndex = nummersList.indexOf(8);
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println(" " + nummersList.get(i));
        }



    }

}
