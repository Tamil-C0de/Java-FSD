package Collections_Framework;

class BankAccount{
	private int balance = 100;
	
	public synchronized void withdraw(int amount) {
		if(balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw.");
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " completed the withdrawal");
		}
		else {
			System.out.println("Not enough balance for " + Thread.currentThread().getName());
		}
	}
	
	public int getbalance() {
		return balance;
	}
}

public class Synchronization_Class {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		Thread t1 = new Thread(() -> {
				account.withdraw(50);
		}, "User 1");
		
		Thread t2 = new Thread(() -> {
				account.withdraw(50);
		}, "User 2");
		
		t1.start();
		t2.start();
	}

}

/*
 2 ways
Thread class
Runnable Interface

Thread States
New
Runnable
Blocked/Waiting
Terminated

Separation of Concerns(SoC)
All in one -> tightly coupled
task scheduling , business logic

Step 1 -> Buy Bread and ingredients
Step 2 -> Make Sandwich
Lambda expression (Arrow function)
 */
