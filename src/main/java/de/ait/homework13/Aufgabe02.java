package de.ait.homework13;

import java.util.ArrayList;

public class Aufgabe02 {
    public static void main(String[] args) {
        /*Create an ArrayList with the strings: "one", "two", "three", "four", "five".
         * Write a program that rearranges
         * list elements in reverse order.
         * Print the list before and after the rearrangement.
         */

        //Create an ArrayList with strings
        ArrayList<String> listString=new ArrayList<>();
        listString.add("one");
        listString.add("two");
        listString.add("three");
        listString.add("four");
        listString.add("five");

        //Displaying the "to" list
        System.out.println("Source array");
        System.out.println(listString);

        //#1
        for(int i=0; i<listString.size()/2; i++)
        {
            String str= listString.get(i);
            listString.set(i,listString.get(listString.size()-i -1));
            listString.set(listString.size() -i -1, str);
        }
        System.out.println("Converted array");
        System.out.println(listString);


        //#2
        int sizeOfList = listString.size();
        for (int i = sizeOfList - 1; i >= 0; i--) {
            System.out.println("Reversed: " + listString.get(i));
        }
        for (int i = 0; i < sizeOfList; i++) {
            System.out.println("Original" + listString.get(i));
        }


        //#3
        ArrayList<String> numbersReverse = new ArrayList<>();
        for (int i = listString.size() - 1; i >= 0; i--) {
            numbersReverse.add(listString.get(i));
        }
        System.out.println (numbersReverse);
    }

}
