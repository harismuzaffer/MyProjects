package com.day1;

import java.util.Scanner;


public class CommnadLineArgDemo {

	public static void main(String[] args) {
		/*int empId = Integer.parseInt(args[0]);
		String empName = args[1];
		double salary = Double.parseDouble(args[2]);
		System.out.println("Emp ID "+empId+" "+"empName "+" "+empName+" salary"+" "+salary);
*/	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Employee Id ");
	int empId = input.nextInt();
	System.out.println("Enter Employee Name ");
	String empName = input.next();
	System.out.println("Enter Salary ");
	double salary = input.nextDouble();
	System.out.println("Emp ID "+empId+" "+"empName "+" "+empName+" salary"+" "+salary);
			
	
	
	
	
	
	}

}
