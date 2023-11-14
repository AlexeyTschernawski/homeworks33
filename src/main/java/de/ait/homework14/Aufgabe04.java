package de.ait.homework14;

import java.util.ArrayList;
import java.util.Iterator;

public class Aufgabe04 {
    public static void main(String[] args) {
        /*
         * Create a list of words.
         * Remove all words from the list
         * whose length is less than 5 characters.
         * Output the final list.
         */
        ArrayList<String> slova = new ArrayList<>();

        slova.add("House");
        slova.add("Car");
        slova.add("Hallo");
        slova.add("Bonjour");

        System.out.println(slova);

        for (int i=0; i< slova.size(); i++){
            String word = slova.get(i);
            if(word.length() < 5){
                slova.remove(i);
                //i--;
            }
        }
        System.out.println(slova);

         //#2
        Iterator<String> iterator = slova.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() < 5) {
                iterator.remove();
            }
        }
        System.out.println(slova);

    }
}
