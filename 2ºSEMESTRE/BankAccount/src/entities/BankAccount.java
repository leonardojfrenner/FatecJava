package entities;

public class BankAccount {
	private int number;
	private String accountHolder;
	private double balance;
	
	public BankAccount(int number, String accountHolder) {
		this.number = number;
		this.accountHolder = accountHolder;
	}
	
	
	public BankAccount(int number, String accountHolder, double initialBalance) {
		this.number = number;
		this.accountHolder = accountHolder;
		deposit(initialBalance);
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		balance += value;	
	}
	public void withdraw(double value) {
		balance = balance - (value + 5);
	}
	@Override
	public String toString() {
		return "BankAccount [number=" 
				+ number 
				+ ", accountHolder=" 
				+ accountHolder 
				+ ", balance=" 
				+ String.format("%.2f%n", balance)
				+ "]";
	}
	
	
	
}
