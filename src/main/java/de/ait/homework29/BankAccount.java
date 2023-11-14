package de.ait.homework29;

public class BankAccount {

    private String accountNumber;
    private final String PUC = "334455";
    public static final String BLZ = "2233344";


    private float balance;

    private int pinCode;

    public BankAccount(String accountNumber, float balance, final int pinCode) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pinCode = pinCode;
    }

    public void deposit(float amount){
        balance = balance + amount;
        System.out.println("call deposit");
    }

    public void withdraw(float amount, int userPin){
        if(pinCode == userPin && amount <= balance){
            balance = balance - amount;
        }
        else {
            System.out.println("Paramethers are wrong");
        }
    }

    public String checkBalance(){
        return String.valueOf(balance);
    }
}
