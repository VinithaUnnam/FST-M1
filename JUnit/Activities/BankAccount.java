package junit;

public class BankAccount {
    private Integer balance;

    // Constructor that initializes the balance
    public BankAccount(Integer initialBalance) {
        balance = initialBalance;
    }

    // Method to withdraw an amount, throws NotEnoughFundsException if balance is insufficient
    public Integer withdraw(Integer amount) throws NotEnoughFundsException {
        if (balance < amount) {
            throw new NotEnoughFundsException(amount, balance);  // Throwing the custom exception
        }
        balance -= amount;
        return balance;  // Return the updated balance
    }
}


