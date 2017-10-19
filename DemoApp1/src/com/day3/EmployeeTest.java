package com.day3;


public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateOfBirth dob= new DateOfBirth();
		dob.setDay(1);
		dob.setMonth(13);
		dob.setYear(1994);
		
		Adress address = new Adress();
		address.setStreet("basin");
		address.setCity("ecity");
		address.setState("ka");
		
		Employee emp= new Employee();
		emp.setEmpId(111);
		emp.setEmpName("test");
		emp.setEmpEmail("test@gm.com");
		emp.setDob(dob);
		emp.setAddress(address);
		System.out.println(formatEmpDetailsWithDate(emp));
		
		//System.out.println(emp.formatEmpDetails());
		//System.out.println(emp.formatEmpDetailsWithDate());
		
	}
	private static String formatEmpDetailsWithDate(Employee emp){
		String formatDetails= "EmpId:"+emp.getEmpId()+" EmpName:"+emp.getEmpName()+" EmpEmail:"+emp.getEmpEmail()
		+" DateOfBirth:"+emp.getDob().getDay()+"/"+emp.getDob().getMonth()+"/"+emp.getDob().getYear()
		+" Street:"+emp.getAddress().getStreet()+" City:"+emp.getAddress().getCity()+" State:"+emp.getAddress().getState();
		return formatDetails;
	}
}
