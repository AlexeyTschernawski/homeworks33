package de.ait.homework13;

import java.util.ArrayList;

public class Aufgabe01 {
    public static void main(String[] args) {
        /*
        Create a new ArrayList for strings. Add the following lines to it: "Apple",
         "Banana", "Cherry", "Melon", "Blackberry".
         Remove "Melon" from the list. Paste on
         Place "Cherry" in the line "Cherry".
         Print the contents of the list.
         */

        //Create an ArrayLis for strings
        ArrayList<String> fruits = new ArrayList<String>();

        //Add elements to it
        fruits.add("Apple");
        fruits.add("Banan");
        fruits.add("Sweet Cherry");
        fruits.add("Melon");
        fruits.add("Blackberry");

        System.out.print("ArrayFruits contains the next elements" + fruits);
        System.out.println();

        //Remove "Melon" from the list
        fruits.remove(3);

        // Replacing the second element
        fruits.set(2, "Cherry");

        System.out.print("ArrayFruits  contains the next elements after change" + fruits);

    }
}
