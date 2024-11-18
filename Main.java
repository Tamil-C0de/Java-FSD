class Student{
	int id;
	String name;
	
	void display() {
		System.out.println("Student ID: " + id + ", Name: " + name);
	}
}

class Book{
	String title;
	
	public Book(int a, int b) {
		System.out.println(a + b);
	}
	
	public void display() {
		System.out.println("Title: " + title);
	}
}


public class Main {

	public static void main(String[] args) {
		
//		Book book1 = new Book(); // Default Constructor
//		book1.display();
		
		Book book1 = new Book(5, 10);
		book1.display();		
		
		
		
		
		
		
		
		
		
		
		// Creating an Object
//		Student student1 = new Student();
//		
//		// Setting a values
//		student1.id = 101;
//		student1.name = "Bruce";
//		
//		student1.display(); // Calling Method
//		
//		Student student2 = new Student();
//		
//		student2.id = 102;
//		student2.name = "Chris";
//		
//		student2.display();
	}

}

/*
 OOP - Object Oriented Programming
LEGO Blocks
Class - Blueprint
Object

Attributes
Methods

Constructor -> same as classname
Default    Parameterized 
*/
