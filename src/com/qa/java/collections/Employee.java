package com.qa.java.collections;

public class Employee {
	
	private int empID;
	private String fName;
	private String lName;
	private String email;
	private double salary;
	private int workX;
	
	
	Employee(){
		empID = 0;
		fName = "John";
		lName = "Smith";
		email = "john.smith@gmail.com";
		salary = 0;
		workX = 0;
		
	}
	
	public Employee(int empID, String fName, String lName, String email, double salary, int workX) {
		super();
		this.empID = empID;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.salary = salary;
		this.workX = workX;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkX() {
		return workX;
	}

	public void setWorkX(int workX) {
		this.workX = workX;
	}
	
}
