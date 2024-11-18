package Collections_Framework;

import java.util.Stack;

public class Stack_Example {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack);
		System.out.println("Top Element: " + stack.peek());
		
		System.out.println("Popped Element: " + stack.pop());
		System.out.println("Top Element after pop: " + stack.peek());
		
		stack.push(40);
		System.out.println("Top Element after adding: " + stack.peek());
	}

}
