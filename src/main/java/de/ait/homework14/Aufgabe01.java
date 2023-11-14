package de.ait.homework14;

import java.util.ArrayList;

public class Aufgabe01 {
    public static void main(String[] args) {
        /*
        Create two lists of type String: the first contains the names,
         the second is surnames. Create a third list,
         which will contain full names (first and last name),
         combining the two previous lists. Display the third list
         */
        ArrayList<String> imena = new ArrayList<>();
        ArrayList<String> familii = new ArrayList<>();
        ArrayList<String> polnyeimena = new ArrayList<>();
        imena.add("Alex");
        imena.add("Frank");
        imena.add("Doris");
        imena.add("Milena");
        imena.add("Jane");
        familii.add("Schmidt");
        familii.add("Huber");
        familii.add("Schulz");
        familii.add("Meyer");
        familii.add("Friedrich");
        if (imena.size() != familii.size() || imena.isEmpty() || familii.isEmpty()) {
            System.err.println("Data cannot be processed");
        }
        else {
            for (int i = 0; i < imena.size(); i++) {
                String full = imena.get(i) + " " + familii.get(i);
                polnyeimena.add(full);
            }
            System.out.println(polnyeimena);
        }

    }
}
