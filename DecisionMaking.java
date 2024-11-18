import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
//		int speed = 75;
//		if(speed < 100 && speed > 0) {
//			System.out.println("Good Speed!");
//		}
//		else if(speed == 100) {
//			System.out.println("Not bad!");
//		}
//		else if(speed < 0) {
//			System.out.println("Invalid Speed");
//		}
//		else {
//			System.out.println("Speed is not ok!");
//		}
		
		Scanner input = new Scanner(System.in);
//		
//		int age = input.nextInt();
//		int weight = input.nextInt();
//		if(age > 18) {
//			if(weight > 50) {
//				System.out.println("You are eligible to donate blood");
//			}
//			else {
//				System.out.println("Not eligible coz you are under weight");
//			}
//		}
//		else {
//			System.out.println("Not eligible you are under age");
//		}
		
		
//		int marks = input.nextInt();
//		
//		switch(marks) {
//			case 90:
//				System.out.println("A grade");
//				break;
//				
//			case 80:
//				System.out.println("B grade");
//				break;
//				
//			case 70:
//				System.out.println("C grade");
//				break;
//				
//			case 60:
//				System.out.println("D grade");
//				break;
//				
//			default:
//				System.out.println("Invalid");
//		}
		
		String day = input.next();
		switch(day) {
			case "sunday":
				System.out.println("1st Day");
				break;
			case "monday":
				System.out.println("2nd Day");
				break;
			case "tuesday":
				System.out.println("3rd Day");
				break;
			case "wednesday":
				System.out.println("4th Day");
				break;
			default:
				System.out.println("Invalid Day");
		}
		
		
		
		
		
		
		
		
	}

}
