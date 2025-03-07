package Bank;

public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient funds, you still need $" + (amount - balance) + " to withdraw $" + amount);
		}
		else {			
			balance  -= amount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void accountStatus() {
		System.out.print(
				"Account Number: " + accountNumber + "\n"
				+ "Balance: $" + getBalance()
				);
	}
	
	
}
