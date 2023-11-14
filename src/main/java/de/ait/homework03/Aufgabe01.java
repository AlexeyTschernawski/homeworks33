package de.ait.homework03;

import java.util.Scanner;

public class Aufgabe01 {
    /*
    Напишите программу, которая получает на вход два числа и
    выводит большее из них. Используйте логические операторы в вашем условии.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// Цены на продукты
        int cokePrice = 3;
        int waterPrice = 2;
        int chocolatePrice = 5;
        System.out.println(
                "affordable food:");
        System.out.println(
                "1. coca-cola - " + cokePrice + " €");
        System.out.println(
                "2. watter  - " + waterPrice + " €");
        System.out.println(
                "3. Choco - " + chocolatePrice + " €");
        System.out.print(
                "select the product (inter the number): ");
        int productChoice = scanner.nextInt();
        int productPrice = 0;
        String productName = "";
// Определение выбранного продукта и его стоимости
        switch (productChoice) {
            case 1:
                productName =

                "coca-cola";
                productPrice = cokePrice;
                break;
            case 2:
                productName =
                        "watter";
                productPrice = waterPrice;
                productPrice = waterPrice;
                break;
            case 3:
                productName = "choco";
                productPrice = chocolatePrice;
                productPrice = chocolatePrice;
                break;
            default:
                System.out.println(
                        "Incorrect product selection.");
                return;
        }
        System.out.println(
                "inter the amount of money: ");
        int moneyAmount = scanner.nextInt();
        if (moneyAmount < productPrice) {
            int moneyNeeded = productPrice - moneyAmount;
            System.out.println("not enough money, please deposit more " + moneyNeeded + " €.");


        }
    }
}
