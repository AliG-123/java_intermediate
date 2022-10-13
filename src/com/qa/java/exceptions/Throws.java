package com.qa.java.exceptions;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Throws {

	public static void main(String[] args) throws Exception {

		try {
			String filePath = "C:\\Users\\aligo\\Desktop\\QA\\";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the file name: ");
			String fileName = sc.nextLine();

			String completePath = filePath + fileName;
			File f = new File(completePath);
			FileReader reader = new FileReader(f);
			System.out.println((char) reader.read());
		} catch (Exception e) {
			System.out.println("Inside Catch");
			e.printStackTrace();
			main(null);
		}
	}
}

//		try {
//			File f = new File("C:\\Users\\aligo\\Desktop\\QA\\file1.txt");
//			FileReader reader = new FileReader(f);
//			System.out.println((char)reader.read());
//			
//		}catch(Exception e){
//			System.out.println("Inside catch ..");
//			e.printStackTrace();