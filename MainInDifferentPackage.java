import Access_Modifiers.Person;

class Developer extends Person{
	public Developer(String name) {
		super(name);
	}
	
	public void sayhello() {
		greet();
	}
}


public class MainInDifferentPackage {

	public static void main(String[] args) {
//		Employee emp = new Employee("Mark");
		Person person = new Person("Mark");
//		person.greet();
		Developer dev = new Developer("Kevin");
		dev.sayhello();
	}

}
/*
 Polymorphism
   Compile-time(Static) -> Method Overloading
   Run-time(Dynamic) -> Method Overriding

Access Modifiers -> class, methods, variables
   Private -> Access within a class 
   Default(package-private) -> Access within a same package
   Protected -> access within the same package and 
                access by subclasses of different classes
   Public
 */