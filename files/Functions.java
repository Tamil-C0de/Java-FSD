import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
//		add(); // function calling
//		add();
//		add();
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		sum(a, b); // function calling
//		System.out.println(a);
//		System.out.println(x);
	}
	
//	public static void add() { // function definition
//		int a = 10, b = 20;
//		System.out.println(a + b);
//	}
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
		a += 10;
		System.out.println(a);
	}
}
