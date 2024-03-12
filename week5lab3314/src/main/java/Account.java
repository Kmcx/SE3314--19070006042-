public class Account {
    private double balance;

    /**

     * @param initialBalance the initial balance of the account
     */
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    /**
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * @param amount the amount to withdraw
     * @return true if withdrawal is successful
     */
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }
}




