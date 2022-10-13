package com.qa.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Collection {
	// Method to return salary bonus
	static double salaryBonus(double salary, int experience) {
		if (experience >= 2)
			return salary * 2;
		else
			return salary * 1.5;
	};

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee());
		employees.add(new Employee(1, "Ali", "Qa", "aligoni@gmail.com", 20000.00, 3));
		employees.add(new Employee(2, "Jabril", "Qa", "jabril@gmail.com", 30000.00, 2));
		employees.add(new Employee(3, "David", "Qa", "david@gmail.com", 40000.00, 1));
		employees.add(new Employee(4, "Inan", "Qa", "inan@gmail.com", 50000.00, 5));
		employees.add(new Employee(5, "Adam", "Qa", "adam@gmail.com", 60000.00, 1));

		for (Employee employee : employees) {
			System.out.println("Employee Id: " + employee.getEmpID());
			System.out.println(employee.getfName());
			System.out.println(employee.getlName());
			System.out.println(employee.getEmail());
			System.out.println("Work experience: " + employee.getWorkX() + " years");
			double newSalary = salaryBonus(employee.getSalary(), employee.getWorkX());
			System.out.println(employee.getfName()+"'s salary will be increased from £" + employee.getSalary() + " to £" + newSalary);
			System.out.println();

		}
	}

}

//int[] salaries = {47323,12412,24553,53542,32432,12345,12345};
//int maxSalary = salaries[0];
//for (int salary:salaries) {
//	if (salary > maxSalary) {
//		maxSalary = salary;	
//	}
//}
//System.out.println("The highest salary is: "+ maxSalary);

//ArrayList salaries = new ArrayList();
//salaries.add("Ali");
//salaries.add(6);
//salaries.add("David");
//salaries.add("Inan");
//salaries.add("Cezar");
//
//for(Object number :salaries) {
//	System.out.println(number);
//}
//for(int i = 0; i<salaries.size();i++) {
//	System.out.println(salaries.get(i));
//	
//}

//salaries.add(10000);
//salaries.add(20000);
//salaries.add(30000);
//salaries.add(40000);
//salaries.add(40000);
//salaries.add(50000);
//ArrayList<Integer> unique = new ArrayList<Integer>();
//
//for(int number :salaries) {
//	if (!unique.contains(number))
//		unique.add(number);
//}
//for (int uniqueNumbers:unique) {
//	System.out.println(uniqueNumbers);;
//}
//System.out.println("The value 300 is at index" + salaries.indexOf(300));
//System.out.println("The value 30000 is at index" + salaries.indexOf(30000));
//

//ArrayList<Integer> salaries = new ArrayList<Integer>();
//salaries.add(5000);
//salaries.add(10000);
//salaries.add(15000);
//salaries.add(20000);
//salaries.add(25000);
//
//
//System.out.println(salaries);
//for (int salary:salaries) {
//	System.out.println(salary);