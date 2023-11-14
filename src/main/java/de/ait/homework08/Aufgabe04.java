package de.ait.homework08;

import java.util.Scanner;

public class Aufgabe04 {

    public static void main(String[] args) {
        /**
         Bank Account: Create a program that simulates how a bank account works.
         * The user can select actions such as depositing funds,
         * withdrawal of funds and balance check. Use a do-while loop
         * to continue working with the account until the user decides to log out.
         */
        Scanner sc = new Scanner(System.in);
        String deposited = "Deposit funds-1";
        String withdrawn = "Withdrawal-2";
        String checking = "Balance check-3";
        String exid = "Exit-0";
        String operation;
        int putin = 20;
        int status;
        System.out.println(deposited + withdrawn + checking + exid);
        do {
            status = sc.nextInt();
            switch (status) {
                case 1:
                    operation = "Depositing money";
                    System.out.println(operation);
                    System.out.println("How much do you want to deposit?");
                    putin = putin + sc.nextInt();
                    System.out.printf("You have %d euro in your account", putin);
                    break;
                case 2:
                    operation = "Withdrawals";
                    System.out.println(operation);
                    System.out.println("How much do you want to deposit?");
                    int rashod = sc.nextInt();
                    if (rashod > putin) {
                        System.out.println("You don't have enough money for this");
                    } else {
                        putin = putin - rashod;
                    }
                    System.out.printf("You have %d euro in your account", putin);
                    break;
                case 3:
                    operation = "check balance";
                    System.out.println(operation);
                    System.out.printf("your balance %d euro", putin);
                    break;
                case 0:
                    operation = "exid";
                    System.out.println(operation);
                    break;
                default:
                    System.err.println("wrong input");
                    status = 0;
            }

        }
        while (status != 0);

    }

}
