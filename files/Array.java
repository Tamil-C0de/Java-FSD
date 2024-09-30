import java.util.Arrays;

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
		
	
		int matrix[][] = {
				{1, 2, 3},
				{4, 5, 6, 4},
				{7, 8}
		};
		
		int marks[] = {80, 70, 60, 90};
		int array[][] = new int[3][];

		System.out.println(matrix[0][2]);
		System.out.println(marks.length);
//		System.out.println(Arrays.toString(matrix[0]));
//		System.out.println(matrix[2].length);
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
