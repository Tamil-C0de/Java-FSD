package Collections_Framework;

import java.util.ArrayList;

public class ShoppingCart {

	public static void main(String[] args) {
		ArrayList<String> cart = new ArrayList<>();
		cart.add("Laptop");
		cart.add("Smartphone");
		cart.add("Headphone");
		
		System.out.println("Items in the cart: " + cart);
		
		cart.add("Smartwatch");
		System.out.println("Items in the cart: " + cart);
		
		System.out.println(cart.get(1));
		
		cart.remove(1);
		System.out.println("Items in the cart: " + cart);
		
		System.out.println(cart.size());
		
		cart.clear();
		System.out.println("Items in the cart: " + cart);
	}

}

/*
 *Exception Handling
   Checked Exception -> compile time
   Unchecked Exception -> run-time
Collections
   Dynamic size

ArrayList
 */
