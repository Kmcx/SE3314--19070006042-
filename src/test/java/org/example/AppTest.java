package org.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

    @Test
    public void testAccountMethods() {
        // Create an account with initial balance 1000
        Account account = new Account(1000);

        // Test deposit method
        account.deposit(500);
        assertEquals(1500, account.getBalance(), 0);

        // Test withdrawal method with sufficient balance
        assertTrue(account.withdraw(200));
        assertEquals(1300, account.getBalance(), 0);

        // Test withdrawal method with insufficient balance
        assertFalse(account.withdraw(2000));
        assertEquals(1300, account.getBalance(), 0);
    }

    @Test
    public void testCustomerMethods() {
        // Create a customer with initial deposit 2000
        Customer customer = new Customer("John Doe", 2000);

        // Test getName method
        assertEquals("John Doe", customer.getName());

        // Test getAccount method
        assertNotNull(customer.getAccount());
        assertEquals(2000, customer.getAccount().getBalance(), 0);
    }

    @Test
    public void testBankMethods() {
        // Create a bank
        Bank bank = new Bank();

        // Test createAccountForCustomer method
        bank.createAccountForCustomer("Alice", 3000);
        bank.createAccountForCustomer("Bob", 4000);

        // Test retrieveAccount method
        Account aliceAccount = bank.retrieveAccount("Alice");
        Account bobAccount = bank.retrieveAccount("Bob");

        assertNotNull(aliceAccount);
        assertNotNull(bobAccount);
        assertEquals(3000, aliceAccount.getBalance(), 0);
        assertEquals(4000, bobAccount.getBalance(), 0);

        // Test retrieveAccount method with non-existent customer
        assertNull(bank.retrieveAccount("Eve"));
    }
}
