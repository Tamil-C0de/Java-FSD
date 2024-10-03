 // java.lang

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "Hello";
//		String s2 = "Hello";
		
//		String s3 = new String("Hello");
//		String s4 = new String("Hello");
//		System.out.println(s1 == s2);
//		System.out.println(s3 == s4);
//		int i = 10;
		
		String str1 = "Hello";
		String str2 = str1;
//		System.out.println("String 1: " + str1);
//		System.out.println("String 2: " + str2);
		
		str1 = str1 + " WORLD";
//		System.out.println("After Modification");
//		System.out.println("String 1: " + str1);
//		System.out.println("String 2: " + str2);
		
		System.out.println(str1.length());
		System.out.println(str1.charAt(7));
		
		System.out.println(str1.substring(0, 5));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.replace('l', '-'));
		
		String s = "Apple,Banana,Cherry";
		String[] fruits = s.split("a");
		System.out.println(Arrays.toString(fruits));
		//System.out.println("My age is " + 23); // Concatenation
	}

}

/*
 students = 2; subjects = 3
grades[2][3]
for(int i = 0; i < students; i++) {
   System.out.println("Enter grades for Student " + (i + 1) + ":");
   for(int j = 0; j < subjects; j++) {
	System.out.print("Subject " + (j + 1) + ": ");
	grades[i][j] = input.nextInt();
   }
}
i = 0; 0 < 2
Enter grades for Student 1:
j = 0; 0 < 3
Subject 1: 85 => grades[0][0]
j = 1; 1 < 3
Subject 2: 90 => grades[0][1]
j = 2; 2 < 3
Subject 3: 78 => grades[0][2]
j = 3; 3 < 3

i = 1; 1 < 2
Enter grades for Student 2:
j = 0; 0 < 3
Subject 1: 88 => grades[1][0]
j = 1; 1 < 3
Subject 2: 88 => grades[1][1]
j = 2; 2 < 3
Subject 3: 88 => grades[1][2]
j = 3; 3 < 3 i =2; 2 < 2


for(int i = 0; i < students; i++) {
   int total = 0;
   for(int j = 0; j < subjects; j++) {
	total = total + grades[i][j];
   }
   double average = total / subjects;
			
   System.out.println("Student " + (i + 1) + " - Total: " + total + ", Average: " + average);
}
i = 0; 0 < 2 => total = 0
j = 0; 0 < 3 => total = 0 + grades[0][0] => 85
j = 1; 1 < 3 => total = 85 + grades[0][1] => 90 + 85 => 175
j = 2; 2 < 3 => total = 175 + grades[0][2] => 78 + 175 =>253
j = 3; 3 < 3
average = 253 / 3 => 84


java.lang
String => Immutable
Special memeory => String Constant Pool
JVM  => reference
id1 => Hello <= id2

Heap Memory

strid1 => Hello <= strid2

strid1 => "Hello World" 
 
 */






