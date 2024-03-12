import junit.framework.TestCase;

public class AccountTest extends TestCase {

    public void testDeposit() {
        // Create an account with initial balance 1000
        Account account = new Account(1000);

        // Test deposit method
        account.deposit(500);
        assertEquals(1500, account.getBalance(), 0);
    }

    public void testWithdraw() {
        // Create an account with initial balance 1000
        Account account = new Account(1000);

        // Test withdrawal method with sufficient balance
        assertTrue(account.withdraw(500));
        assertEquals(500, account.getBalance(), 0);

        // Test withdrawal method with insufficient balance
        assertFalse(account.withdraw(1000));
        assertEquals(500, account.getBalance(), 0);
    }

    public void testGetBalance() {
        // Create an account with initial balance 1000
        Account account = new Account(1000);

        // Test getBalance method
        assertEquals(1000, account.getBalance(), 0);
    }
}