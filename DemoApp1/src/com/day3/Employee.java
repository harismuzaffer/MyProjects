package com.day3;

public class Employee {
	private int empId;
	private String empName;
	private String empEmail;
	private DateOfBirth dob;
	private Adress address;
	
	public Adress getAddress() {
		return address;
	}
	public void setAddress(Adress address) {
		this.address = address;
	}
	public DateOfBirth getDob() {
		return dob;
	}
	public void setDob(DateOfBirth dob) {
		this.dob = dob;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
}
