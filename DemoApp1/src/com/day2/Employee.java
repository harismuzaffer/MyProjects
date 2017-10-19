package com.day2;

public class Employee {
	static int accNumber=303;
	String empId;
	String empName;
	String empEmail;
	float salary;
	
	public Employee() {
		this.empId= genId();
	}
	public Employee(String empName) {
		this();
		this.empName= empName;
	}
	public Employee(String empName, String empEmail) {
		this(empName);
		this.empEmail= empEmail;
	}
	public Employee(String empName, String empEmail, float salary) {
		this(empName, empEmail);
		this.salary= salary;
	}
	public String showDetails(){
		return "Id: "+empId+" empEmail:"+empEmail+" Salary:"+salary;
	}
	public String genId(){
		return "IBM08"+accNumber++;
	}
}
