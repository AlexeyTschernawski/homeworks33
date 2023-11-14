package de.ait.homework06;

import java.util.Scanner;

public class Aufgabe04 {
    public static void main(String[] args) {
        /*
        Write a program that takes the number n as input
          and outputs a pyramid of stars of height n.
         -->3
           *
          ***
         '****
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the Christmas tree: ");
        int numberHeight = scanner.nextInt();

        /**for (int i=0; i < numberHeight; i++){
            for (int y=0; y < numberHeight -i-1; y++ )
            {
                System.out.print(" ");
            }
            for (int s=0; s < 2*i+1; s++){
                System.out.print("*");
            }
            System.out.println("");
        }*/


        //#2

        //int n=10;
        //TODO Check cycles
        String sim="";
        for (int jk=0;jk<=numberHeight-1;jk++) {
            String s = " ";
            for (int i = 1; i < numberHeight - jk/2; i++) {
                s += " ";
            }

            sim+= "*";
            String sim1 = s.concat(sim);
            //String substr=sim1.substring(0,*);
            if (jk%2==0) System.out.println(sim1);
        }
    }
}
