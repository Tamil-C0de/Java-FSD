import java.util.*;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}

class AgeLessThanZero extends Exception{
	public AgeLessThanZero(String message) {
		super(message);
	}
}


class Registration{
	public void checkAge(int age) throws InvalidAgeException, AgeLessThanZero {
		if(age > 0 && age < 18) {
			throw new InvalidAgeException("You must be 18 years or old to register.");
		}
		else if(age < 0) {
			throw new AgeLessThanZero("Invalid Age Input");
		}
		else {
			System.out.println("You are registered successfully");
		}
	}
}

public class Exception_Handling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		Registration reg = new Registration();
		
		try {
			reg.checkAge(age);
		}catch (InvalidAgeException e) {
			System.out.println("Registration failed: " + e.getMessage());
		}catch(Exception e) {
			System.out.println("Registration failed: " + e.getMessage());
		}
//		Scanner sc = new Scanner(System.in);
//		try {
//			int num1 = sc.nextInt();
//			int num2 = sc.nextInt();
//			int res = num1 / num2;
//			System.out.println(res);
//		} catch(Exception e) {
//			System.out.println("Error: You cannot divide by zero");
//		} finally {
//			System.out.println("Program End");
//		}
		
	}

}
