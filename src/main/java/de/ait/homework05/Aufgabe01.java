package de.ait.homework05;

public class Aufgabe01 {

    /*
    Write a program that displays the calendar for the current month to the console.
     Dates must be aligned across columns.
     */

    public static void main(String[] args) {
        String m = "Mn";
        String t = "Tu";
        String w = "We";
        String tu = "Th";
        String f = "Fr";
        String sat = "Sa";
        String sun = "Su";
        String space = "______________________";
        System. out. println (" ______________________");
        System. out.printf("%-10s %10s %10s %10s %10s %10s %10s %n",m,t,w,tu,f,sat,sun);
        System. out. println (space);
        System.out.printf("%-10s %10s %10s %10s %10s %10s %10s %n", "","", "","","", "1", "2");
        System.out.printf("%-10s %10s %10s %10s %10s %10s %10s %n", "3", "4", "5", "6", "7", "8", "9");
        System.out.printf("%-10s %10s %10s %10s %10s %10s %10s %n", "10", "11", "12", "13", "14", "15", "16");
        System.out.printf("%-10s %10s %10s %10s %10s %10s %10s %n", "17", "18", "19", "20", "21", "22", "23");
        System.out.printf("%-10s %10s %10s %10s %10s %10s %10s %n", "24", "25", "26", "27", "28", "29", "30");
        System.out.printf("%-10s %10s %10s %10s %10s %10s %10s %n", "31", "","","","","","");
        System.out.println(space);
        System.out.println("");}
    }





