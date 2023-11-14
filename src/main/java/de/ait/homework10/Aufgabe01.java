package de.ait.homework10;

import java.util.Scanner;

public class Aufgabe01 {
    public static void main(String[] args) {
        /*
        Write a program that determines
         does the array contain
          number specified from the keyboard.
         */
        int [] salary = new int[]{1200, 1400, 1300, 1000, 1500, 1800};//declaration and initialization
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary: "); // prüfe was für Input
        int checkSalary=scanner.nextInt();
        boolean result = false;

        for (int i = 0; i < salary.length; i++ ){
            if (checkSalary == salary[i]){
                result = true;
                System.out.println(result);
            }
        }
        if(result==false){
            System.out.println(result);
        }

    }
}
