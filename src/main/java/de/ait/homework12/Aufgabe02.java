package de.ait.homework12;

import java.util.Scanner;

public class Aufgabe02 {
    public static void main(String[] args) {
        /*
         * Write a program
         * which takes two integers n and m
         * and uses two nested
         * for loop to print a rectangle
         * from stars of size n x m.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height (n) of the rectangle ");
        int n = scanner.nextInt();
        System.out.println("Enter the  width(m) of the rectangle ");
        int m = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print("\uD83D\uDe0A");
                }
            }
            System.out.println();
        }

        Scanner scan=new Scanner(System.in);
        System.out.println("Введите размеры прямоугольника");
        String a = "\uD83D\uDe0A";
        String b="\u2720";
        for(int i=0;i<n;i++)
        {
            for (int j=0; j<m;j++)
            {
                if((n-i-1==j)||i==j)
                {
                    System.out.print(b +" ");
                }
                else {
                    System.out.print(a +" ");
                }
            }
            System.out.println("\t");
        }
    }
}
