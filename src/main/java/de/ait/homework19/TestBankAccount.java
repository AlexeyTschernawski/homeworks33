package de.ait.homework19;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccountAnton = new BankAccount(1122,1500.30);
        bankAccountAnton.deposit(1000);

        BankAccount bankAccountSofya = new BankAccount(1124,2500.25);


        bankAccountAnton.deposit(2000);
        bankAccountAnton.withdraw(100);
        System.out.println(bankAccountAnton.getBalance());

        bankAccountSofya.deposit(2500);
        bankAccountSofya.withdraw(7100);
        System.out.println(bankAccountSofya.getBalance());
    }
}
