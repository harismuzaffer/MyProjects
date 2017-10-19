package com.day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date= null;
		Scanner in= new Scanner(System.in);
		String dob= in.next();
		SimpleDateFormat format= new SimpleDateFormat("dd/mm/yyyy");
		try {
			date= format.parse(dob);
			return;
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("hoo");
	}

}
