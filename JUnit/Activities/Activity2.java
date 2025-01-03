package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Activity2 {
	@Test
	public void notEnoughFunds() {
		BankAccount account = new BankAccount(10);
		assertThrows(NotEnoughFundsException.class, () -> {
			account.withdraw(20); // Trying to withdraw more than the available balance
		}, "NotEnoughFundsException should be thrown when there are insufficient funds");
	}

	@Test
	public void enoughFunds() {
		BankAccount account = new BankAccount(100);
		assertDoesNotThrow(() -> {
			account.withdraw(50); // Trying to withdraw more than the available balance
		}, "NotEnoughFundsException should NOT be thrown when there are enough funds");
	}
}
