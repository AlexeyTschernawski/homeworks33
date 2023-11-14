package de.ait.homework03;

public class Aufgabe06 {

    /*
    Напишите программу, которая определяет знак зодиака,
    исходя из даты рождения пользователя.
    Знак зодиака определяется по диапазону дат,
    поэтому вам потребуется использовать логические
     операторы для определения правильного знака зодиака.
     */

    public static void main(String[] args) {
        int month = 02;
        int day = 11;


        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            System.out.println("your zodiac sign - Aquarius");
        } else if ((month == 2 && day >= 19 && day <= 29) || (month == 3 && day <= 20)) {
            System.out.println("your zodiac sign - pisces");
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            System.out.println("your zodiac sign - aries");
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            System.out.println("your zodiac sign - taurus");
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            System.out.println("your zodiac sign - gemini");
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            System.out.println("your zodiac sign - cancer");
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            System.out.println("your zodiac sign - leo");
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            System.out.println("your zodiac sign - virgo");
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            System.out.println("your zodiac sign - libra");
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            System.out.println("your zodiac sign - scorpio");
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            System.out.println("your zodiac sign - sagittarius");
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            System.out.println("your zodiac sign - capricorn");
        } else {
            System.err.println("incorrect data entered");
        }


    }
}
