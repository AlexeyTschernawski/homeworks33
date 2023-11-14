package de.ait.homework14;

import java.util.ArrayList;
import java.util.Random;

public class Aufgabe03 {
    public static void main(String[] args) {
        /*
         * Create a list of numbers. Get a sublist
         * consisting of the first 5 elements of the original list.
         * Double every number in this sublist. Display the sublist
         */

        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayList<Integer> listInt1 = new ArrayList<>();
        Random ran = new Random();
        listInt.add(1);
        for (int i = 0; i <= 10; i++) {
            int chislo = ran.nextInt(100 + 1);
            listInt.add(chislo);
        }
        System.out.println(listInt);
        for (int j = 0; j < 5; j++) {
            listInt1.add(listInt.get(j));
            listInt1.add(listInt.get(j));
        }
        System.out.println(listInt1);


        //#2
        ArrayList<Integer> ListNumber = new ArrayList<>();
        int min = 0;
        int max = 50;
        for (int i = 0; i < 10; i++) {
            ListNumber.add((int) (Math.random() * (max - min) + min));
        }

        System.out.print("List of number: ");
        for (int listnumber : ListNumber) {
            System.out.print(" " + listnumber);
        }

        ArrayList<Integer> sublistNumber = new ArrayList<>();
        sublistNumber.addAll(ListNumber.subList(0, 5));

        for (int n = 0; n < sublistNumber.size(); n++) {
            sublistNumber.set(n, sublistNumber.get(n) * 2);
        }

        System.out.print("\nSubList:        ");
        for (int sublist : sublistNumber) {
            System.out.print(" " + sublist);
        }

    }


}
