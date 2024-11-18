class BankAccount{
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	public String getAccountNumber() {
//		this.amount = amount;
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		if(accountNumber == null) {
			System.out.println("Invalid Accout Number");
		}
		else {
			this.accountNumber = accountNumber;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew: " + amount);
		}
		else {
			System.out.println("Invalid amount");
		}
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("", 500);
		
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Balance: " + account.getBalance());
		
		account.setAccountNumber(null);
		
		account.deposit(200);
		System.out.println("New Balance: " + account.getBalance());
		
		account.withdraw(150);
		System.out.println("New Balance: " + account.getBalance());
	}

}
