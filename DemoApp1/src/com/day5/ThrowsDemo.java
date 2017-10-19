package com.day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThrowsDemo {
	public static void main(String[] args) {
		ThrowsDemo t= new ThrowsDemo();
		try {
			t.method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public void method1() throws ParseException, InvalidDataException {
		Scanner in= new Scanner(System.in);
		String dob= in.next();
		SimpleDateFormat format= new SimpleDateFormat("dd/mm/yyyy");
		//Date date= format.parse(dob);
		throw new InvalidDataException();
	}
	
	public void method2() throws Exception{
		method1();
	}
	public void method3() throws Exception{
		method2();
	}
	
}
