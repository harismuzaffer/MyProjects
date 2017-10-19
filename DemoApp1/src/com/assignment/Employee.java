package com.assignment;

import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {
	int id;
	String name;
	String address;
	
	public void saveEmployee(){
		Scanner in= new Scanner(System.in);
		System.out.println("enter Employee id");
		id= in.nextInt();
		System.out.println("enter Employee name");
		name= in.next();
		System.out.println("enter Employee address");
		address= in.next();
	}
	
	public String toString(){
		return "[EmployeeId:"+id+", EmployeeName:"+name+", EmployeeAddress:"+address+"]";
	}
}
