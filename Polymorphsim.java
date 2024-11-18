//class PaymentProcessor{
//	void processPayment(int amount) {
//		System.out.println("Processing payment of Rs." + amount + " via default method.");
//	}
//	
//	void processPayment(int amount, String creditCardNumber) {
//		System.out.println("Processing payment of Rs." + amount + " via credit card " + creditCardNumber);
//	}
//	
//	void processPayment(int amount, String bankaccount, String ifsc) {
//		System.out.println("Processing payment of Rs." + amount + " via bank transfer. Bank Account: " + bankaccount);
//	}
//}

class User{
	void authenticate() {
		System.out.println("Generic User Authentication");
	}
}

class Admin extends User{
	void authenticate() {
		System.out.println("Admin authentication with full access");
	}
}

class Customer extends User{
	void authenticate() {
		System.out.println("Customer authentication with limited access");
	}
}


public class Polymorphsim {

	public static void main(String[] args) {
//		PaymentProcessor processor = new PaymentProcessor();
//		processor.processPayment(500);
//		processor.processPayment(500, "123-4567-890");
//		processor.processPayment(500, "9876543210", "IFSC0987");
		
		Admin admin = new Admin();
		admin.authenticate();
	}

}
