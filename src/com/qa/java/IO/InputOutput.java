package com.qa.java.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

class User{
	String id;
	String firstName;
	String lastName;
	
	public User(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}
}

public class InputOutput {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\aligo\\Desktop\\QA\\delimiter.txt");
		FileReader reader = new FileReader(file);
		
		//Create ArrayList of users
		ArrayList<User> users = new ArrayList<User>();
		BufferedReader buffer = new BufferedReader(reader);
		String line = buffer.readLine();
		while(line != null) {
			String[] lineArray = line.split(" ");
			users.add(new User(lineArray[0],lineArray[1],lineArray[2]));
			line = buffer.readLine();
		}

		
		for(User user: users ) {
			System.out.println("ID is:" + user.id);
			System.out.println("First name is: " +user.firstName);
			System.out.println("Last name is: " + user.lastName);
			System.out.println();
		
	}

	}

}
