class Vehicle{
	int speed;
	
	void startEngine() {
		System.out.println("Engine started");
	}
	
	void stopEngine() {
		System.out.println("Engine stopped");
	}
}

class Car extends Vehicle{
	String model;
	
	void setModel(String model) {
		this.model = model;
	}
	
	void showDetails() {
		System.out.println("Model: " + model + ", Speed: " + speed);
	}
}

class Bike extends Vehicle{
	String bikeType;
	
	void setBikeType(String type) {
		bikeType = type; 
	}
	
	void showDetails() {
		System.out.println("BikeType: " + bikeType + ", Speed: " + speed);
	}
}

class ElectricCar extends Car{
	int batteryCapacity;
	
	void chargeBattery() {
		System.out.println("Battery charged to " + batteryCapacity + " kWh");
	}
}


public class Inheritance {

	public static void main(String[] args) {
//		Car car1 = new Car();
//		car1.speed = 120;
//		car1.model = "";
//		car1.setModel("Toyota");
//		
//		car1.startEngine();
//		car1.stopEngine();
//		car1.showDetails();
		
		
//		ElectricCar evcar = new ElectricCar();
//		evcar.speed = 160;
//		evcar.setModel("Tesla Model 3");		
//		evcar.batteryCapacity = 75;
//		
//		evcar.startEngine();
//		evcar.showDetails();
//		evcar.chargeBattery();
		
		Bike b1 = new Bike();
		b1.speed = 100;
		b1.setBikeType("Mountain");
		
		b1.startEngine();
		b1.showDetails();
	}

}


/*
 *Inheritance
  Single
  Multilevel
  Hierarchical
  Multiple(Interface)
  Hybrid
*/