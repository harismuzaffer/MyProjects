package com.day4.cosmic;

public class EmployeeTest {
	public static void main(String[] args) {
		//String representation
		Employee e1 = new Employee(100,"John");
		Employee e2 = new Employee(100,"John");
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
	}

}
