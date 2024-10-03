import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
//		int[] numbers = new int[5];
//		
//		numbers[0] = 10;
//		numbers[1] = 20;
//		numbers[2] = 30;
//		numbers[3] = 40;
//		numbers[4] = 50;
		
//		System.out.println(numbers[5]);
		
//		int marks[] = {80, 70, 60, 90};
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println(numbers[i]);
//		}
		
		// for-each loop
		
//		for(int num: numbers) {
//			System.out.println(num);
//		}
		
//		System.out.println(Arrays.toString(marks));
//		Arrays.sort(marks);
//		System.out.println(Arrays.toString(marks));
//		System.out.println(marks[2]);
		
//		int filledArray[] = new int[5];
//		Arrays.fill(filledArray, 200);
//		System.out.println(Arrays.toString(filledArray));
//		
//		int arr1[] = {1, 2, 3};
//		int arr2[] = {1, 2};
//		System.out.println(Arrays.equals(arr1, arr2));
		
	
//		int matrix[][] = {
//				{1, 2, 3},
//				{4, 5, 6, 4},
//				{7, 8}
//		};
//		
//		int marks[] = {80, 70, 60, 90};
//		int array[][] = new int[3][];
//
//		System.out.println(matrix[0][2]);
//		System.out.println(marks.length);
////		System.out.println(Arrays.toString(matrix[0]));
////		System.out.println(matrix[2].length);
//		for(int i = 0; i < matrix.length; i++) {
//			for(int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
		
//		Scanner input = new Scanner(System.in);
//		int size = input.nextInt();
//		
//		int arr[] = new int[size];
//		
//		for(int i = 0; i < size; i++) {
//			arr[i] = input.nextInt();
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
//		2D Array -> Student Grade System
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int students = input.nextInt();
		
		System.out.print("Enter the number of subjects: ");
		int subjects = input.nextInt();
		
		int[][] grades = new int[students][subjects];
		
		for(int i = 0; i < students; i++) {
			System.out.println("Enter grades for Student " + (i + 1) + ":");
			for(int j = 0; j < subjects; j++) {
				System.out.print("Subject " + (j + 1) + ": ");
				grades[i][j] = input.nextInt();
			}
		}
		
		// Calculate Total and Average
		for(int i = 0; i < students; i++) {
			int total = 0;
			for(int j = 0; j < subjects; j++) {
				total = total + grades[i][j];
			}
			double average = total / subjects;
			
			System.out.println("Student " + (i + 1) + " - Total: " + total + ", Average: " + average);
		}
		
		
		
		
		
		
		
	}

}
