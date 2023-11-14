package de.ait.homework03;

public class Aufgabe03 {

    /*
    Промежутки чисел: Напишите программу, которая проверяет,
    находится ли введенное число в определенном диапазоне.
    Например, вы можете проверить, является ли число отрицательным,
    положительным или нулевым, используя логические операторы.
     */

    public static void main(String[] args) {

        int number = 0;

        if(number > 0 && number!= 0){
            System.out.println("the number "   + number + " positive");
        }
        else if(number < 0 && number != 0 ) {
            System.out.println("the number "   + number + " nagative");
        }
        else {
            System.out.println("the number "   + number + " is 0");
        }

    }
}
