import junit.framework.TestCase;

public class CustomerTest extends TestCase {

    public void testGetName() {
        // Create a customer with initial deposit 2000
        Customer customer = new Customer("John Doe", 2000);

        // Test getName method
        assertEquals("John Doe", customer.getName());
    }

    public void testGetAccount() {
        // Create a customer with initial deposit 2000
        Customer customer = new Customer("John Doe", 2000);

        // Test getAccount method
        assertNotNull(customer.getAccount());
        assertEquals(2000, customer.getAccount().getBalance(), 0);
    }
}