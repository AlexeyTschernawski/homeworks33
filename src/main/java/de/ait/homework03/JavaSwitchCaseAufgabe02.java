package de.ait.homework03;

import java.util.Scanner;

public class JavaSwitchCaseAufgabe02 {

    //Определить время года по номеру месяца
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the month number for check: ");
        int month = scanner.nextInt();


        switch (month){
            case 1,2,12 -> {
                if (month == 1){
                    System.out.print("january");
                }
                if (month == 2){
                    System.out.print("february");
                }
                else {
                    System.out.print("Дdecember");
                }
            }
            case 3,4,5 -> System.out.println("spring");
            case 6,7,8 -> System.out.println("summer");
            case 9,10,11 -> System.out.println("automn");
            default -> System.err.println("wrong month number");
        }
        scanner.close();

    }
}
