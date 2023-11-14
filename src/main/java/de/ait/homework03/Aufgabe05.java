package de.ait.homework03;

public class Aufgabe05 {
    /*
    Напишите программу, которая принимает возраст пользователя и
    выводит возрастную категорию: ребенок (до 12 лет),
    подросток (13-18 лет), взрослый (19-59 лет), пожилой (60 лет и старше).
     */

    public static void main(String[] args) {

        int age = 90;

        if (age <= 12 && age > 0) {
            System.out.println("you are child. you are " + age + " old");
        } else if (age >= 13 && age <= 18) {
            System.out.println("you are a teenager. you are " + age + " old");
        } else if (age >= 19 && age <= 59) {
            System.out.println("you are an adult. you are " + age + " old");
        } else if (age >= 60 && age <= 110) {
            System.out.println("you are elderly. you are " + age + " old");
        } else {
            System.err.println("error!!!");
        }
    }
}
