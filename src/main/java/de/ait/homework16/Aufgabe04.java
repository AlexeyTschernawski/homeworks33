package de.ait.homework16;

import java.util.ArrayList;

public class Aufgabe04 {
    public static void main(String[] args) {
        /*
        Create a concatenate method,
         which takes an array of strings
          and returns one string,
          consisting of all elements of the array,
          united together.

         */

        String[] array = new String[5];
        array[0] = "green";
        array[1] = "yellow";
        array[2]= " ";
        array[3] = "blue";
        array[4] = "black";

        System.out.println(slozheniestrok(array));

        ArrayList<String> stringArrayList = new ArrayList<>();
        //First group of 4 digits IBAN
        int ibanGroupNumberOne = 1234;

        stringArrayList.add(String.valueOf(ibanGroupNumberOne));
        stringArrayList.add("4567");
        stringArrayList.add("6789");
        stringArrayList.add("7777");

        System.out.println(createString(stringArrayList));





    }

    static String slozheniestrok(String[] array)
    {
        String stroka="";
        for (int i=0;i<array.length;i++)
        {
            stroka=stroka.concat(array[i]);
        }
        return stroka;
    }

    static String createString(ArrayList<String> stringsArray){
        String result = "";
        for(String string: stringsArray ){
            result  = result.concat(string);
        }
        return result;
    }







}
