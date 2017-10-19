package com.day3;

public class EmployeeTest {

	public static void main(String[] args) {
		DateOfBirth dob = new DateOfBirth();
		dob.setDay(1);
		dob.setMonth(11);
		dob.setYear(1234);
		
		
		
		Employee emp = new Employee();
		emp.setEmpId(111);
		emp.setEmpName("test");
		emp.setEmpEmail("test@gmail.com");
		emp.setDob(dob);
		System.out.println(formatEmpDetailsWithDate(emp));

	}

	private static String formatEmpDetailsWithDate(Employee emp) {
		String formatDetails ="Employee Name "+emp.getEmpId()+"Employee Name "+emp.getEmpName()
				+"Date of Birht "+emp.getDob().getDay()+"/"+emp.getDob().getMonth()+"/"+emp.getDob().getYear();
		
		
		return formatDetails;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
