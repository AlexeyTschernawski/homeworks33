package de.ait.homework17;

import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe02 {
    public static void main(String[] args) {
        /*
        Create a method that concatenates the passed
          lines into one, separating
          their specified delimiter.
         */
        //ArrayList<String> stringsToDelimite = inputWords();
        //String resultString = delimiterMethod(stringsToDelimite);
        //System.out.println(resultString);


        //#2
        //StringJoiner joiner = new StringJoiner(",", "[", "]");
        /*String joinedString = joiner.add("Hello")
                .add("------")
                .add("World")
                .toString();
        System.out.println(joinedString);*/

        stringConcatenation();


    }

    static String delimiterMethod (ArrayList<String> sheet){
        String result = "";
        System.out.println("Enter separator:");
        String separator = delimiter();
        for (int x=0; x<sheet.size(); x++){
            result = result + sheet.get(x);
            //TODO remove if
            if (x < sheet.size() -1){
                result = result + separator;
            }
        }
        return result;
    }

    static ArrayList<String> inputWords() {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите слово или 'Exit' для завершения:");
            String input = scanner.nextLine();
            if (input.equals("Exit")) {
                break;
            }
            words.add(input);
        }
        //scanner.close();
        return words;
    }

    static String delimiter() {
        Scanner scanner = new Scanner(System.in);
        String delimiter = scanner.nextLine();
        //scanner.close();
        return delimiter;
    }

    //#3
    static String transfer(String first, String second, String delimiter)
    {
        String result=first.concat(delimiter).concat(second);
        return result;
    }

    //#4
    static void stringConcatenation(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter separator: ");
        String delimiter = scanner.nextLine();
        System.out.println("Enter lines (to exit, enter 'exit'):");
        ArrayList<String> strings = new ArrayList<>();
        String input ;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("exit")) {
                break; // Exit loop if "exit" is entered
            }
            strings.add(input);
            strings.add(delimiter);
        }
        int sizeStrings = strings.size();
        strings.remove(sizeStrings-1);
        for (int i = 0; i < strings.size(); i++) {
            System.out.print(strings.get(i));
        }
        scanner.close();
    }
}
