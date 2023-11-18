package de.ait.homework49;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;

public class BankAccount {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);


    private String accountNumber;

    private String ownerName;

    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        try {
            if (amount <= 0) {
                throw new InsufficientFundsException("Deposit not possible", balance, amount);
            } else {
                balance = balance + amount;
                LOGGER.info("AccountNumber {} --> New balance is {}. Amount: {} ",
                        accountNumber, balance, amount);
            }
        } catch (InsufficientFundsException exception) {
            LOGGER.error("Wrong amount: {} Exception: {}", amount, exception.getMessage());
        }


    }

    public void depositNew(double amount)  throws FileNotFoundException {
            if (amount <= 0) {
                throw new InsufficientFundsException("Deposit not possible", balance, amount);
            } else {
                balance = balance + amount;
                LOGGER.info("AccountNumber {} --> New balance is {}. Amount: {} ",
                        accountNumber, balance, amount);
            }
    }

    public void withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new InsufficientFundsException("Withdraw not possible", balance, amount);
            } else {
                balance = balance - amount;
                LOGGER.info("AccountNumber {} --> New balance is {}. Amount: {} ",
                        accountNumber, balance, amount);
            }
        } catch (InsufficientFundsException exception) {
            LOGGER.error("Wrong amount: {} Exception: {}", amount, exception.getMessage());
        }
    }


}
