package Access_Modifiers;

//class Employee{
//	String name;
//	
//	Employee(String name){
//		this.name = name;
//	}
//	
//	void displayInfo() {
//		System.out.println("Employee Name: " + name);
//	}
//}


public class MainInSamePackage {

	public static void main(String[] args) {
//		Employee emp = new Employee("John Wick");
//		emp.displayInfo();
//		Person person = new Person("Ram");
//		person.greet();
		
		Student student = new Student("Kumar");
		student.greet();
	}

}
