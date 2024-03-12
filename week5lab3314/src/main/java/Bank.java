import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    /**
     * Creates an account for a customer.
     * @param name the name of the customer
     * @param initialDeposit the initial deposit amount
     */
    public void createAccountForCustomer(String name, double initialDeposit) {
        Customer customer = new Customer(name, initialDeposit);
        customers.add(customer);
    }

    /**
     * Retrieves the account of a customer.
     * @param name the name of the customer
     * @return the account of the customer, or null if not found
     */
    public Account retrieveAccount(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer.getAccount();
            }
        }
        return null;
    }
}
