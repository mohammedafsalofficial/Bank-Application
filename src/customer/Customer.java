package customer;

/**
 * Represents a customer with details such as customerId, accountId, name, balance and password.
 * This class provides getter and setter methods to access and modify the customer's details.
 */
public class Customer {

    private int customerId;
    private long accountNumber;
    private String name;
    private double balance;
    private String password;

    public Customer(int customerId, long accountNumber, String name, double balance, String password) {
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return customerId + " " + accountNumber + " " + name + " " + balance + " " + password;
    }
}