/**
 * Represents a customer of the bank.
 */
public class Customer {
    private String name;
    private Account account;

    /**
     * Constructs a customer with a name and an initial deposit.
     * @param name the name of the customer
     * @param initialDeposit the initial deposit amount
     */
    public Customer(String name, double initialDeposit) {
        this.name = name;
        account = new Account(initialDeposit);
    }

    /**
     * Gets the name of the customer.
     * @return the name of the customer
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the account of the customer.
     * @return the account
     */
    public Account getAccount() {
        return account;
    }
}

