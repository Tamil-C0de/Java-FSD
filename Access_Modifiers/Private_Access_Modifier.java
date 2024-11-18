package Access_Modifiers;

class BankAccount{
	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}

public class Private_Access_Modifier {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
//		account.balance = 500;
		account.deposit(250);
		System.out.println(account.getBalance());
	}

}
