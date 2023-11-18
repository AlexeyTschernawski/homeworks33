package de.ait.homework49;

import java.io.FileNotFoundException;

public class TestBankAccount {

    private  static BankAccount bankAccount;

    public static void main(String[] args) {

        bankAccount = new BankAccount("1234", "Müller, Max", 1000);

        try {
            bankAccount.depositNew(-100);
        }
        catch (InsufficientFundsException | FileNotFoundException exception){
            System.out.println("ERROR"+ exception.getMessage());
        }



    }
}
