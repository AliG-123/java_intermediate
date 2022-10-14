package com.qa.java.collections;

import java.util.HashSet;
import java.util.Scanner;

public class HashSets {
	
	public static void main(String[] args) {
		//The code below takes names from the user and adds the name to a set
		//if the name is already in the set then the user is informed.
		//user decides when to stop and then all the names are printed
		Scanner sc = new Scanner(System.in);

		HashSet<String> names = new HashSet<String>();

		boolean flag = true;
		while (flag) {
			System.out.println("Please enter a name: ");
			String name = sc.next();
			if (names.contains(name)) {
				System.out.println("Name taken");
			}
			names.add(name);
			System.out.println();
			boolean flag2 = true;
			while (flag2) {
				System.out.println("Add another? Press 1 for Yes or 2 for No");
				String option = sc.next();
				if (option.equals("1")) {
					break;
				} else if (option.equals("2")) {
					flag = false;
					flag2 = false;
				} else {
					System.out.println("Invalid option try again");
				}

			}
		}

		for (String n : names) {
			System.out.println(n);
		}

	}
}
