package Collections_Framework;

class MyThread extends Thread{
	public void run() {
		System.out.println("Thread is running!");
	}
}

class MyRunnable implements Runnable{
	public void run() {
		System.out.println("Runnable is running");
	}
}


class RestaurantWorker1 extends Thread{
	public void takeOrder() {
		System.out.println("Taking the Order.");
	}
	
	public void cookFood() {
		System.out.println("Cooking the food.");
	}
	
	public void processPayment() {
		System.out.println("Processing the payment.");
	}
	public void run() {
		takeOrder();
		cookFood();
		processPayment();
	}
}

class RestaurantWorker2 implements Runnable{
	private String task;
	
	public RestaurantWorker2(String task) {
		this.task = task;
	}
	
	public void run() {
		if (task.equals("takeOrder")){
			takeOrder();
		} else if(task.equals("cookFood")) {
			cookFood();
		} else if(task.equals("processPayment")) {
			processPayment();
		}
	}
	
	private void takeOrder() {
		System.out.println("Taking the Order.");
	}
	
	private void cookFood() {
		System.out.println("Cooking the food.");
	}
	
	private void processPayment() {
		System.out.println("Processing the payment.");
	}
}

public class Threads {

	public static void main(String[] args) {
		
		RestaurantWorker1 worker = new RestaurantWorker1();
//		worker.start();
		
		Thread takeOrderThread = new Thread(new RestaurantWorker2("takeOrder"));
		takeOrderThread.start();
		
		MyThread thread1 = new MyThread();
//		thread.start();
		
		Thread thread2 = new Thread(new MyRunnable());
//		thread2.start();
	}

}

/*
 * Multithreading
helper -> thread
       Thread 
Program -> Company
Thread -> Employees
smallest unit of processing -> Thread
it shares resources(memory)
Efficiency
Faster Execution -> reduces overall timing
 */
