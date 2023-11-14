package de.ait.homework03;

public class Aufgabe02 {

    /*
    Нечетное или четное: Напишите программу,
    которая определяет, является ли введенное число четным или нечетным.
    Используйте операторы "И" и "ИЛИ" для обработки нескольких условий.
     */

    public static void main(String[] args) {

        double number = 12.2;

        if(number%2 == 0){
            System.out.println("the number is" + number + " even");
        }
        else {
            System.out.println("the number is" + number + " odd");
        }
    }
}
