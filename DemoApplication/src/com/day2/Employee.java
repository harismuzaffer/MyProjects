package com.day2;

public class Employee {
	  private static int empCounter = 100;
	  private int empId = 123;
	  
	  {
	    System.out.println("init block executed"+empId);
	  }
	  
	  static{
	    System.out.println("static block executed");
	  }
	  
	  public Employee(){
	    System.out.println("Constructor executed");
	  }
	 
	  public static void main(String[] args) {
		Employee e1 = new Employee();
	  }
	}
