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
            LOGGER.error("Сумма для депозита {} не может быть отрицательной или равной 0.", amount);
        }
        else {
            balance = balance + amount;
            LOGGER.info("Аккаунт владельца {} пополнен на сумму {} €", owner, amount);
        }
    }

    public void withdraw(double amount){
        if(amount <=0){
            LOGGER.error("Сумма для снятия {} не может быть отрицательной или равной 0.", amount);
        }

        if(amount > balance){
            LOGGER.error("С аккаунта {} невозможно снять сумму в размере {} €", owner, amount);
        }
        else {
            balance = balance - amount;
            LOGGER.info("Сумма в размере {} € успешно снята с аккаунта {}", amount, owner);
        }
    }

    public double checkBalance(){
        LOGGER.debug("Запрошен баланс владельца аккаунта {}", owner);
        return balance;
    }


}
