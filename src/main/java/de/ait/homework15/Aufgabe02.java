package de.ait.homework15;

import java.util.Scanner;

public class Aufgabe02 {

    public static void main(String[] args) {
        /**
         * Schreiben Sie eine Methode, die akzeptiert
         * string und gibt ihn in umgekehrter Reihenfolge zurück.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word to reverse it:");
        String userWord = scanner.nextLine();

        String reverseWord = methodReverse(userWord);
        System.out.println("Here is your reverse word: \n" + reverseWord);
        System.out.println("Here is your reverse word: \n" + convertString(userWord));
    }

    static String methodReverse(String word){
        String reverse = new StringBuffer(word).reverse().toString();
        return reverse;
    }

    //#2
    static String convertString(String stringToReverse)
    {
        char[] chars=stringToReverse.toCharArray();
        int length=chars.length;
        char[] chars1= new char[length];
        for (int i=0;i<length;i++)
        {
            chars1[i]=chars[length-1-i];
        }
        String result = String.valueOf(chars1);
        System.out.println("Get the result");
        return result;
    }

}
