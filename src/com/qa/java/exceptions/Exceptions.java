package com.qa.java.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		
		try {
			int[] marks = {21,54,64,27,81};
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numerator: ");
			int numerator = sc.nextInt();
			System.out.println("Enter the denominator: ");
			int denominator = sc.nextInt();
			int result = numerator/denominator;
			System.out.println("The result is " + result);
			
			System.out.println("Enter the index which you wish to access from the array: ");
			
			int index = sc.nextInt();
			System.out.println(marks[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside ArrayIndexOutOfBoundsException catch block");
			e.printStackTrace();
			main(null);
		}
		catch(ArithmeticException e) {
			System.out.println("Inside ArithmeticException catch block");
			e.printStackTrace();
			main(null);
		}
	
	
	}
}
		
//try {
//	int[] salaries = {1242,21531,24532};
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Please enter the index you wish to access: ");
//	int index = sc.nextInt();
//	System.out.println(salaries[index]);
//}catch(ArrayIndexOutOfBoundsException e ) {
//	System.out.println("Index is not valid");
////	e.printStackTrace();
//	main(null);
//	
//}
//catch(InputMismatchException e) {
//	System.out.println("Index is not valid");
////	e.printStackTrace();
//	main(null);
//}
		
//		Exceptions main = new Exceptions();
//		main.divideInputs();0

//	}

//	void divideInputs() {
//		try { 
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Please input a number for numerator: ");
//			int numerator = sc.nextInt();
//			System.out.println("Please input a number for denominator: ");
//			int denominator = sc.nextInt();
//			int result = numerator/denominator;
//			System.out.println("The result of the division is "+ result);
//
//		}
//		catch (Exception e) {
//
//			System.out.println("inside catch...");
//
//			e.printStackTrace();
//
//			main(null);
//		}
//	}
//}
