package de.ait.homework13;

import java.util.ArrayList;

public class Aufgabe04 {
    public static void main(String[] args) {
        /**
         * Create two ArrayLists with strings.
         * Find the elements that are present in
         * both lists and create a new list based on them.
         * Output a new list.
         */
        ArrayList<String> listString1 = new ArrayList<>();
        ArrayList<String> listString2 = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        listString1.add("one");
        listString1.add("two");
        listString1.add("three");
        listString1.add("seven");
        listString1.add("one");
        listString2.add("three");
        listString2.add("two");
        listString2.add("four");
        listString2.add("one");
        for (int j = 0; j < listString2.size(); j++) {
            for (int i = 0; i < listString1.size(); i++) {
                String checkElement = listString1.get(i);
                String elementInListArray = listString2.get(j);
                if (checkElement.equals(elementInListArray) && !result.contains(checkElement)) {
                    result.add(checkElement);
                }
            }
        }
        System.out.println(result);


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("Good");
        list1.add("rain");
        list1.add("country");
        list1.add("wind");
        list1.add("sun");


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("night");
        list2.add("wind");
        list2.add("sky");
        list2.add("Java");
        list2.add("Good");
        list2.add("wind");//TODO check if the element has already been added
        System.out.println(list1);
        System.out.println(list2);

        ArrayList<String> temp = new ArrayList<>();
        for (String element1:list1 ){
            for (String element2:list2){
                if (element1.equals(element2)){
                    temp.add(element1);
                }
            }
        }
        System.out.println("Common Elements: " + temp);
    }
}
