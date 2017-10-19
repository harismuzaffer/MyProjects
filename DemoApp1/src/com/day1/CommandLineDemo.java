package com.day1;

import java.util.Scanner;

public class CommandLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int empId = Integer.parseInt(args[0]);
		Double empSal= Double.parseDouble(args[1]);
		String empName= args[2];
		System.out.println(args[0]+" "+args[1]+" "+args[2]);*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the emp id");
		int empId =  input.nextInt();
		System.out.println("enter emp name");
		String empName = input.next();
		System.out.println("enter salary");
		Double sal = input.nextDouble();
		System.out.println(empId+" "+empName+" "+sal);
	}

}
