package de.ait.homework02;

public class AufgabeLesson01 {

    public static void main(String[] args) {
        int dayCheck = 29;
        int dayFebruary = 40;

        /**if (dayFebruary>=28 && dayFebruary<=29 && dayFebruary != dayCheck){
            System.out.println("Год не високосный");
        } else if (dayFebruary == dayCheck) {
            System.out.println("Год високосный");
        } else {
            System.out.println("ERROR!");
        }
         */

        /**int year = 2023;
        System.out.println(year % 4 == 0);
        if(year % 4 == 0 ){
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год не високосный");
        }
         */

        /**int days = 366;
        int daysOfYear = 366;
        if(daysOfYear >= 365 && daysOfYear == 366 && days == daysOfYear){
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год не високосный");
        }*/

        int year = 1909;

        if ((year %4 == 0 && year % 100 != 0)|| (year%400==0)) {

            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }



}
