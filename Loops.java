import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
//		int count = 1;
//		for(int count = 1; count <= 10 ; count++) {
//			System.out.println(count);
//		}
//		int num = 101;
//		while(num <= 100) {
//			System.out.println(num);
//			num += 10; // num = num + 10
//		}
//		
//		int counter = 100;
//		do {
//			System.out.println(counter);
//			counter++;
//		}while(counter < 11);
		
		Scanner sc = new Scanner(System.in);
//		int rows = sc.nextInt();
//		
//		for(int i = 1; i <= rows; i++) {
//			for(int j = 1; j <= rows; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		int num;
//		do {
//			System.out.print("Enter a number: ");
//			num = sc.nextInt();
//			if(num < 0) break;
//		}while(true);
		
//		for(int i = 1; i <= 10; i++) {
//			if(i % 2 != 0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		while(true) {
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			
			if(number == 0) break;
			
			if(number % 3 == 0) continue;
			
			System.out.println("User entered: " + number);
		}
		
	}

}








