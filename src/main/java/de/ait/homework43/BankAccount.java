package de.ait.homework43;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);


    private String owner;

    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <=0){
            LOGGER.error("The deposit amount {} cannot be negative or equal to 0.", amount);
        }
        else {
            balance = balance + amount;
            LOGGER.info("Owner {} account has been replenished with {} €", owner, amount);
        }
    }

    public void withdraw(double amount){
        if(amount <=0){
            LOGGER.error("Withdrawal amount {} cannot be negative or equal to 0.", amount);
        }

        if(amount > balance){
            LOGGER.error("It is not possible to withdraw {} € from account {}", owner, amount);
        }
        else {
            balance = balance - amount;
            LOGGER.info("Amount of {} € has been successfully withdrawn from account {}", amount, owner);
        }
    }

    public double checkBalance(){
        LOGGER.debug("Account owner {} balance requested", owner);
        return balance;
    }


}
