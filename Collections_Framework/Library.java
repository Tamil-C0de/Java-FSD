package Collections_Framework;

import java.util.HashMap;

public class Library {

	public static void main(String[] args) {
		HashMap<String, String> books = new HashMap<>();
		
		books.put("987-654-321-0", "Book 1");
		books.put("987-654-321-1", "Book 2");
		books.put("987-654-321-2", "Book 3");
		books.put("987-654-321-0", "Book 4");
		
//		System.out.println(books);
		String book = books.get("987-654-321-1");
		System.out.println(book);
		
//		System.out.println(books.keySet());
		for (String isbn: books.keySet()) {
			System.out.println("ISBN: " + isbn + ", Book: " + books.get(isbn));
		}
		
		books.remove("987-654-321-0");
		
		System.out.println("After Removing Book 1");
		for (String isbn: books.keySet()) {
			System.out.println("ISBN: " + isbn + ", Book: " + books.get(isbn));
		}
	}

}
