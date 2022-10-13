package com.qa.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_First {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohort20", "root", "admin123");

		Scanner sc = new Scanner(System.in);
		System.out.println("Create candidate:      1");
		System.out.println("Update candidate:      2");
		System.out.println("Delete candidate:  	   3");
		System.out.println("View candidates:       4");
		System.out.println("Please choose from the following options: ");
		int option = sc.nextInt();
		if (option == 1) {
			System.out.println("Please enter your candiate id: ");
			int cid = sc.nextInt();
			System.out.println("Please enter your name: ");
			String name = sc.next();
			System.out.println("Please enter your email: ");
			String email = sc.next();
			PreparedStatement pstmt = conn.prepareStatement("insert into candidate values(?,?,?)");
			pstmt.setInt(1, cid);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.execute();
			System.out.println("Candidate created");

		}
		if (option == 2) {
			System.out.println("Please enter the id of candiate you wish to update: ");
			int cid = sc.nextInt();
			System.out.println("Please enter your up to date name: ");
			String name = sc.next();
			System.out.println("Please enter your up to date email: ");
			String email = sc.next();
			PreparedStatement pstmt = conn.prepareStatement("update candidate set name = ?, email = ? where id = ?");
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setInt(3, cid);
			pstmt.execute();
			System.out.println("Candidate updated");

		}
		if (option == 3) {
			System.out.println("Please enter the id of candiate you wish delete: ");
			int cid = sc.nextInt();
			PreparedStatement pstmt = conn.prepareStatement("delete from candidate where id = ?");
			pstmt.setInt(1, cid);
			pstmt.execute();
			System.out.println("Candidate deleted");
		}
		if (option == 4) {
			System.out.println("View specific candidate: 1");
			System.out.println("View all candidates:     2");
			System.out.println("Please choose an option: ");
			int choice = sc.nextInt();
			ResultSet rs = null;
			if (choice != 1 && choice != 2)
				System.out.println("Invalid Option");
			if (choice == 1) {
				System.out.println("Please enter the id of candidate you wish to view:  ");
				int cid = sc.nextInt();
				PreparedStatement pstmt = conn.prepareStatement("select * from candidate where id = ?");
				pstmt.setInt(1, cid);
				rs = pstmt.executeQuery();
			}
			if (choice == 2) {
				System.out.println("Viewing all candidates");
				PreparedStatement pstmt = conn.prepareStatement("select * from candidate");
				rs = pstmt.executeQuery();

			}
			while (rs.next()) {
				System.out.println("The candidate id is: " + rs.getInt(1));
				System.out.println("The candidate name is: " + rs.getString(2));
				System.out.println("The candidate email is: " + rs.getString(3));
				System.out.println();

			}
		} else if (option != 1 && option != 2 && option != 3 && option != 4) {
			System.out.println("Invalid Option");

		}
	}
}

//
//Statement stmt = conn.createStatement();
//
////stmt.execute("create table candidate(id int, name varchar(20),email varchar(100))");
//stmt.execute("insert into candidate values(103,'David','david@gmail.com')");