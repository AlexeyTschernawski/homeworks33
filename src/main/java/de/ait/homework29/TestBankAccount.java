package de.ait.homework29;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("22334455", 50, 2233);
        bankAccount.withdraw(25, 2233);
        System.out.println(bankAccount.checkBalance());
        bankAccount.withdraw(25, 2233);
        System.out.println(bankAccount.checkBalance());
        bankAccount.deposit(100);
        System.out.println(bankAccount.checkBalance());
        System.out.println(BankAccount.BLZ);


    }
}
