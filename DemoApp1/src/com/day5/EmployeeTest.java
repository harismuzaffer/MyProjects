package com.day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeTest {
	int eid;
	String ename;
	String eemail;
	Date dob;
	Scanner in= new Scanner(System.in);
	public int getEid() {
		return eid;
	}
	public void setEid() {
		try{
			this.eid = Integer.parseInt(in.next());
		}
		catch(NumberFormatException e){
			System.out.println("enter only integers");
		}
	}
	public String getEname() {
		return ename;
	}
	public void setEname() {
		System.out.println("enter name");
		String s= in.next();
		if(s.length()<5){
			try {
				throw new InvalidDataException();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			this.ename = s;
		}
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail() {
		System.out.println("enter email");
		String s= in.next();
		if(s.length()<5){
			try {
				throw new InvalidDataException();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		this.eemail = s;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob() throws ParseException{
		SimpleDateFormat format= new SimpleDateFormat("dd/mm/yyyy");
		this.dob = format.parse(in.next());
	}
	
	
	
}
