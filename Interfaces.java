interface Device{
	void powerOn();
	void powerOff();
	void reset();
}

class Laptop implements Device{
	public void powerOn() {
		System.out.println("Laptop is powered On.");
	}
	
	public void powerOff() {
		System.out.println("Laptop is powered Off.");
	}
	
	public void reset() {
		System.out.println("Laptop is resetting.");
	}
}

class SmartWatch implements Device{
	public void powerOn() {
		System.out.println("Smartwatch is powered On.");
	}
	
	public void powerOff() {
		System.out.println("Smartwatch is powered Off.");
	}
	
	public void reset() {
		System.out.println("Smartwatch is resetting.");
	}
}


public class Interfaces {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.powerOff();

	}

}
