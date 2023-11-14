package de.ait.homework18;

public class Aufgabe02 {
    public static void main(String[] args) {
        /*
        Create a method that takes a variable number of String arguments and returns
        one string made up of all passed strings,
        separated by spaces.
         */
        String result = concat_strings("first", "second", "third", "fourth");
        System.out.println(result);

        System.out.println(concat_strings("first", "second", "third", "fourth"));
        System.out.println(concat_strings("first", "second", "third"));
        System.out.println(concat_strings("first", "second"));
        System.out.println(concat_strings());
    }

    static String concat_strings(String... strings) {
        if(strings.length == 0){
            return "ERROR";
        }
        String total = "";
        for (String string : strings) {
            total = total + string + " ";
        }
        // #2 total = total.substring(0, total.length()-1);
        total = total.trim();
        return total;
    }
}

