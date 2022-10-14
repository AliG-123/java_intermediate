package com.qa.java.collections;

import java.util.HashMap;

class User{
	String firstName;
	String lastName;
	
	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> candidates = new HashMap<Integer, String>();

		candidates.put(3, "Ali");
		candidates.put(7, "Jabril");
		candidates.put(8, "David");
		candidates.put(12, "Inan");
		candidates.put(31, "Gedas");
		candidates.put(32, "Jabril");
		
		System.out.println("The HashMap keys are: "+ candidates.keySet());
		System.out.println("The HashMap values are: " + candidates.values());

		for (int key : candidates.keySet()) {
			System.out.println("The role number is for " + candidates.get(key) + " is: " + key);
		}

	}

}



//User user1 = new User("Ali", "QA");
//User user2 = new User("Jabril", "QA");
//User user3 = new User("Inan", "QA");
//HashMap<Integer, User> candidates = new HashMap<Integer, User>();
//
//candidates.put(3, user1);
//candidates.put(7, user2);
//candidates.put(8, user3);
//
//System.out.println(candidates.values());
//System.out.println(candidates.keySet());
//
//for (int key : candidates.keySet()) {
//	System.out.println("The role number is for " + candidates.get(key).firstName + " "  + candidates.get(key).lastName + " is: " + key);
//}