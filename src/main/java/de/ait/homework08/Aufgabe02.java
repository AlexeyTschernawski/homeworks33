package de.ait.homework08;

import java.util.Scanner;

public class Aufgabe02 {
    public static void main(String[] args) {
        /*
        Write a program that prompts the user for a password.
          If the password does not match the preset one,
          the program should ask for the password again.
          Use a do-while loop for this.
         */
        /**Scanner scanner = new Scanner(System.in);

        String rigthPassword = "Hallo";
        String password;
        do {
            System.out.print("input password: ");
            password = scanner.nextLine();

            if(!password.equals(rigthPassword)){
                System.out.println("not correct.");
            }
        }
        while (!password.equals(rigthPassword));
        System.out.println("proper !!!");
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome, Ente your password");
        String password= "Hello";
        //String mypassword= sc.nextLine();
        int counter =0;
        boolean result = false;
        do {
            String mypassword= sc.nextLine();
            if(mypassword.equals("Hello"))
            {
                System.out.println("Congratulations. You are logged");
                result = true;
                break;
            }
            else
            {
                System.out.println("Please enter your password once more");
                counter++;
            }


        }
        while(counter<=2);
        if(!result) {
            System.out.println("Sorry, no more attempts is possible");
        }
    }

}

