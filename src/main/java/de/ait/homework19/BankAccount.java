package de.ait.homework19;

public class BankAccount {
    /*
        Create a class "Bank Account"
        Fields: account number, balance.
        Methods: constructors,
        deposit(double amount) - adds an amount to the account,
        withdraw(double amount) - withdraws an amount from the account.
        Create a class "Test"
        In this class create several objects
        the above class and call their methods.
     */
    private int accountnumber;
    private double balance;

    final double  limit = 100;

    public BankAccount(String accountnumber, double balance) {
        this.accountnumber = Integer.parseInt(String.valueOf(accountnumber));
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("You have deposited into account no. " + accountnumber + " " + amount + " €. On your account " + balance + " €.");
    }

    public void withdraw(double amount){
        if(checkBankAccount(amount)){
            balance = balance - amount;
            System.out.println("You have withdrawn from account no. " + accountnumber + " " + amount + " €. On your account " + balance + " €.");
        }
        else {
            System.err.println("There are not enough funds in your account to withdraw " + amount + " euros or the withdrawal limit has been exceeded");
        }
    }

    private boolean checkBankAccount(double amount){
        if(amount > limit || amount > balance ){
            return false;
        }
        return true;
    }

    public double getBalance() {

        return balance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        //
        this.accountnumber = accountnumber;
    }

    public int checkBalance() {
        return 0;
    }
}
