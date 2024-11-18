package Collections_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Example {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("Item 1");
		queue.offer("Item 2");
		queue.offer("Item 3");
		
		System.out.println("First Element: " + queue.peek());
		
		System.out.println("Removed: " + queue.poll());
		
		System.out.println("First Element after removal: " + queue.peek());
		
		queue.offer("Item 4");
		System.out.println("New Element Added: " + queue.peek());
	}

}

/*
 ArrayList
LinkedList
 2 parts  -> Data    Pointer
3 Types
   1. Singly Linkedlist
   2. Doubly Linkedlist
   3. Circular Linkedlist

Stack and Queue

Stack -> LIFO [Last In First Out]
push()   pop()   peek()

Queue -> FIFO [First In First Out]
offer()   poll()   peek()
 */
