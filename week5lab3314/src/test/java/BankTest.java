import junit.framework.TestCase;

public class BankTest extends TestCase {

    public void testCreateAccountForCustomer() {
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
    }

    public void testRetrieveAccount() {
        // Create a bank
        Bank bank = new Bank();

        // Test retrieveAccount method with non-existent customer
        assertNull(bank.retrieveAccount("Eve"));
    }
}