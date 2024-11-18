package Collections_Framework;

//class RestaurantWorker extends Thread{
//	private String task;
//	
//	public RestaurantWorker(String task) {
//		this.task = task;
//	}
//	
//	public void run() {
//		if(task.equals("takeOrder")) {
//			takeOrder();
//		}
//		else if(task.equals("processPayment")) {
//			processPayment();
//		}
//		else if(task.equals("cookFood")) {
//			cookFood();
//		}
//	}
//	
//	public void takeOrder() {
//		System.out.println("Taking the Order.");
//	}
//	
//	public void processPayment() {
//		System.out.println("Processing the Payment.");
//	}
//	
//	public void cookFood() {
//		System.out.println("Cooking the Food.");
//	}
//}

class RestaurantWorker implements Runnable{
	private String task;
	
	public RestaurantWorker(String task) {
		this.task = task;
	}
	
	public void run() {
		if(task.equals("takeOrder")) {
			takeOrder();
		}
		else if(task.equals("processPayment")) {
			processPayment();
		}
		else if(task.equals("cookFood")) {
			cookFood();
		}
	}
	
	public void takeOrder() {
		System.out.println("Taking the Order.");
	}
	
	public void processPayment() {
		System.out.println("Processing the Payment.");
	}
	
	public void cookFood() {
		System.out.println("Cooking the Food.");
	}
}

public class Restaurant {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new RestaurantWorker("cookFood"));
		thread1.start();
		
		RestaurantWorker withoutThread = new RestaurantWorker("takeOrder");
		withoutThread.takeOrder();
	}

}
