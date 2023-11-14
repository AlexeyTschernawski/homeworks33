package de.ait.homework09;

import java.util.Scanner;

public class Aufgabe03 {
    public static void main(String[] args) {
        /*
        Write a program that prints a chessboard of a given size
          N x N, using the symbols "#" and " ".
         */


        /**
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the chessdesk size: ");
         int chessDeskSize = scanner.nextInt();
         for (int i = 0; i < chessDeskSize; i++) { /*i - horizontal lines of the board
       // for (int j = 0; j < chessDeskSize; j++) { /*j- vertical lines *2 for symmetry of the board */
         //   if ((i + j) % 2 == 0) {
           //     System.out.print("#\t");
            //} else {
             //   System.out.print("\t");
          //  }
       // }
       // System.out.println(); /* Переход на новую строку после каждой строки доски */
    //}
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the chessdesk size: ");
        int chessDeskSize = scanner.nextInt();
        for (int i = 0; i < chessDeskSize; i++) {
            for (int j = 0; j < chessDeskSize; j++) {
                char square = (i + j) % 2 == 0 ? '\u263b' : '\u263A';
                System.out.print(square + " ");
            }
            System.out.println();
        }
    }
}
