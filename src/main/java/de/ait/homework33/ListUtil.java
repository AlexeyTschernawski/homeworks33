package de.ait.homework33;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

    private static List<String> listA, listB;

    public static void main(String[] args) {

        listA = new ArrayList<>();
        listB = new ArrayList<>();

        listA.add("Apple");
        listA.add("Banana");
        listA.add("Cherry");
        listA.add("Melon");




        listB.add("Apple");
        //listB.add("Банан");
        //listB.add("Киви");
        //listB.add("Дыня");
        //listB.add("Ежевика");
        //listB.add("Арбуз");

        //System.out.println(listA);
        //System.out.println(listB);
        //System.out.println("----------");

        //listA.remove("Вишня");
        //listB.add(2, "Манго");
        //System.out.println(listA);
        //System.out.println(listB);

        String result = compareListsDeep(listA, listB);

        System.out.println(result);

    }

    private static String compareLists(List<String> listA, List<String> listB){
        if(listA.equals(listB)){
            return "The lists are identical";
        }
        else {
            return "Lists are different";
        }
    }

    private static String compareListsDeep(List<String> listA, List<String> listB){
        if (listA.equals(listB)){
            return "The lists are identical";
        }
        else {
            //if(listA.size() < listB.size()){
            for (int i=0; i < listA.size(); i++) {
                if (i < listB.size()) {
                    if (!listA.get(i).equals(listB.get(i))) {
                        System.out.println("Items at index " + i +
                                " differ: " + listA.get(i) +
                                " " + listB.get(i));
                    }
                }
            }
            for ( int y = listA.size(); y < listB.size(); y++){
                System.out.println("Data element is outside of comparison " + listB.get(y));
            }

        }

        return "Lists are different";

        }


}
