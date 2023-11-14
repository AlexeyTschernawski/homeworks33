package de.ait.homework04;

import java.util.Scanner;

public class Aufgabe04 {
    public static void main(String[] args) {
        /*
        (Симулятор торговой машины): Напишите программу, которая симулирует торговую машину.
        У вас есть продукты, такие как "Coca-Cola"(3 евро), "Water"(2 евро), "Chocolate"(5 евро).
        Пользователь вводит название продукта и количество денег.
        Если денег недостаточно, программа должна попросить пользователя внести больше денег.
        Если денег достаточно, программа должна сказать "Вот ваш [товар] и ваша сдача [x] евро.".
         Используйте switch-case и if-else для выполнения этой задачи.
         */

        int cash;
        int change;

        String cocaCola = "Coca-Cola";
        String water = "Water";
        String chocolate = "Chocolate";

        int cocaColaPreis = 3;
        int waterPreis = 2;
        int chocolatePreis = 5;

        String inputWare;

        System.out.print("Выберите товар: Coca-Cola3€), Water(2€), Chocolate(5€)");
        Scanner scanner = new Scanner(System.in);
        inputWare = scanner.next();


        switch (inputWare){
            case "Coca-Cola" -> {
                System.out.print(" Заплатите за выбранный товар: ");
                cash =  scanner.nextInt();
                change = cash - cocaColaPreis;
                if(change > 0){
                    System.out.println("Вот ваша " + cocaCola +  " и ваша сдача " + change + " евро");
                }
                else if (change < 0) {
                    System.out.println("Недостаточно денег. Доплатите " + Math.abs(change) + " евро");
                }
                else {
                    System.out.println("Вот ваша" + cocaCola);
                }
            }
            case "Water" -> {
                System.out.print(" Заплатите за выбранный товар: ");
                cash =  scanner.nextInt();
                change = cash - waterPreis;
                if(change > 0){
                    System.out.println("Вот ваша " + water +  " и ваша сдача " + change + " евро");
                }
                else if (change < 0) {
                    System.out.println("Недостаточно денег. Доплатите " + Math.abs(change) + " евро");
                }
                else {
                    System.out.println("Вот ваша " + water);
                }

            }
            case "Chocolate" -> {
                System.out.print(" Заплатите за выбранный товар: ");
                cash =  scanner.nextInt();
                change = cash - chocolatePreis;
                if(change > 0){
                    System.out.println("Вот ваш " + chocolate +  "и ваша сдача " + change + " евро");
                }
                else if (change < 0) {
                    System.out.println("Недостаточно денег. Доплатите " + Math.abs(change) + " евро");
                }
                else {
                    System.out.println("Вот ваша " + chocolate);
                }
            }
            default -> System.err.println("Товара " + inputWare + " нет в наличии");
        }


    }
}
