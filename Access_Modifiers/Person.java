package Access_Modifiers;

public class Person{
	protected String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	protected void greet() {
		System.out.println("Hello, My name is " + name);
	}
}

class Student extends Person{
	public Student(String name) {
		super(name);
	}
	
	protected void greet() {
		super.greet();
		System.out.println("Hello, I'm a Student and My name is " + name);
	}
}
