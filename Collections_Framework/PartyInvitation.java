package Collections_Framework;

import java.util.HashSet;

public class PartyInvitation {

	public static void main(String[] args) {
		HashSet<String> guestList = new HashSet<>();
		
		guestList.add("Arjun");
		guestList.add("Ramya");
		guestList.add("Lokesh");
		guestList.add("Arjun");
		
		System.out.println(guestList);
		
		if(guestList.contains("Ramya")) {
			System.out.println("Ramya is invited.");
		}
		
		for(String guest: guestList) {
			System.out.println(guest);
		}
	}

}

/*
 HashMap   HashSet

HashMap -> key-value pairs
Key - ISBN number(unique)
Value - Book details
Configuration settings
parametes(variable) -> values
environment variables

put()
 */
