package com.day5;

import java.text.ParseException;
import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter eid, ename, email and dob");
		EmployeeTest e= new EmployeeTest();
		//e.setEid();
		e.setEname();
		e.setEemail();
		try {
			e.setDob();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			System.out.println("enter correct format");
		}
	}

}
