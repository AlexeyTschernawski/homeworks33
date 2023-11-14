package de.ait.homework15;

import java.util.Scanner;

public class Aufgabe04 {
    public static void main(String[] args) {
        /*
         * Create a method to convert
         * temperatures from degrees Celsius
         * to degrees Fahrenheit and vice versa.
         */

        //ввод данных для конвертации
        System.out.println("Input 1 for temp in celsius  2 for fahrenheit, 0 for exit");

        int choosen = readValue();

        switch (choosen){
            case 1: System.out.println("Input celsius ");
                int celsius=readValue();
                System.out.println(fahrenheit(celsius));
                break;
            case 2:
                System.out.println("Input Fahrenheit ");
                int fahrenheit=readValue();
                System.out.println(celsius(fahrenheit));
                //#2
                celsiusVoid(fahrenheit);
                break;
            case 0:System.out.println("BB");break;
        }
    }
     static float fahrenheit(float temp) {
        return ((temp * 9) / 5) + 32;
    }
     static float celsius(float temp) {
        return (temp - 32) * 5 / 9;
    }

     static void celsiusVoid(float temp) {
        float result =  (temp - 32) * 5 / 9;
        System.out.println(result);
    }

    static int readValue(){
        Scanner scn=new Scanner(System.in);
        int choosen=scn.nextInt();
        return choosen;
    }

    static String readStringValue(){
        Scanner scn=new Scanner(System.in);
        String choosen=scn.nextLine();
        return choosen;
    }

}
