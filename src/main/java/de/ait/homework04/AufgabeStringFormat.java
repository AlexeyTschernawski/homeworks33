package de.ait.homework04;

import java.util.Scanner;

public class AufgabeStringFormat {
    public static void main(String[] args) {
        String str = "Hello, Deutschland!";
        System.out.println(str.length());
        //Antwort:18
        System.out.println(str.charAt(4));
        //Antwort: 'o'
        System.out.println(str.toUpperCase());
        //Ответ: HELLO DEUTSCHLAND!
        System.out.println(str.substring(7));
        //Antwort:eutschland!
        System.out.println(str.substring(7, 12));
        //Antwort:eutsc
        char targetChar = ',';
        int index = str.indexOf(targetChar);
        String result = str.substring(0, index);
        System.out.println(result);
        String resultString = str.substring(index + 1, str.length());
        System.out.println(resultString);

        /*
        Write a program that checks whether the wind speed is dangerous.
         Wind speed is considered dangerous if it is less than 10 m/s
         or more than 33 m/s. Your program should accept
         wind speed as input and output "Danger" or "Safe".
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter wind speed: ");
        int speedInput = scanner.nextInt();

        int windSpeedMin = 10;
        int windSpeedMax = 33;

        if (speedInput > windSpeedMin && speedInput < windSpeedMax) {
            System.out.println("no danger");
        } else {
            System.err.println("danger!!!");
        }


    }
}
