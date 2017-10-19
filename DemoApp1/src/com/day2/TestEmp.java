package com.day2;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1= new Employee("Haris", "hari@gmail.com", 34600.55f);
		Employee emp2= new Employee("Imran", "iumu@gmail.com", 64600.55f);
		Employee emp3= new Employee("Bial", "bili@gmail.com", 74600.55f);
		Employee emps[]= {emp1, emp2, emp3};
		for(Employee e: emps)
			System.out.println(e.showDetails());;
	}

}
