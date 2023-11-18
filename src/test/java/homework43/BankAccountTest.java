package homework43;

import de.ait.homework19.BankAccount;
import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ObjectStreamClass;


class BankAccountTest {

    private ObjectStreamClass LogCaptor;
    Class<?> logCaptor = LogCaptor.forClass();

    private BankAccount bankAccountMustermann;

    private BankAccount bankAccountMueller;

    @BeforeEach
    void setUp() {
        bankAccountMustermann = new BankAccount("Mustermann", 0);
        bankAccountMueller = new BankAccount("Mueller", 500);
    }

    @Test
    void testDepositAmountPositivSuccess() {

        logCaptor.toString();
        bankAccountMustermann.deposit(100);
        Assertions.assertEquals(100, bankAccountMustermann.checkBalance());

        String expectedInfoMessage = "Аккаунт владельца Mustermann пополнен на сумму 100.0 €";
        Assertions.assertTrue(Boolean.parseBoolean(logCaptor.getClass().toString()));
    }

    @Test
    void testDepositAmountNegativFail() {
        bankAccountMustermann.deposit(-10);
        Assertions.assertEquals(0, bankAccountMustermann.checkBalance());
    }

    @Test
    void withdrawBalanceOkSuccess() {
        bankAccountMueller.withdraw(100);
        Assertions.assertEquals(400, bankAccountMueller.checkBalance());
    }

    @Test
    void withdrawBalanceNotEnoughFail() {
        bankAccountMueller.withdraw(1000);
        Assertions.assertEquals(500, bankAccountMueller.checkBalance());
    }

    @Test
    void checkBalance() {
        bankAccountMueller.deposit(-200);
        Assertions.assertEquals(500, bankAccountMueller.checkBalance());
    }
}