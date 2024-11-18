import java.util.*;

public class SumRecursion {

	public static int sumOfNumbers(int n) {
		if(n == 1) return 1;
		else return n + sumOfNumbers(n - 1);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(sumOfNumbers(n));
	}

}
/*
 Recursion 
Sum of n numbers
5 => 5 + 4 + 3 + 2 + 1 = 15

if(n == 1) return 1;
else return n + sumOfNumbers(n - 1);

n = 5
if 5 == 1 -> F
else return 15;

n = 4
if 4 == 1 -> F
else return 10;

n = 3
if 3 == 1 -> F
else return 6;

n = 2
if 2 == 1 -> F
else return 3;

n = 1
if 1 == 1 -> T 
return 1
*/