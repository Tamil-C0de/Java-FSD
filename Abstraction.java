abstract class Smartphone{
	abstract void makeCall(String number);
	
	abstract void sendMessage(String number, String message);
	
	void powerOn() {
		System.out.println("Smartphone is powered on.");
	}
}

class AndroidPhone extends Smartphone{
	void makeCall(String number) {
		System.out.println("Calling " + number + " using android phone.");
	}
	
	void sendMessage(String number, String message) {
		System.out.println("Sending message to " + number + ": " + message);
	}
}


public class Abstraction {

	public static void main(String[] args) {
		AndroidPhone androidPhone = new AndroidPhone();
		androidPhone.makeCall("9876543210");
		androidPhone.sendMessage("098765421", "Hello Abstraction");
	}

}
