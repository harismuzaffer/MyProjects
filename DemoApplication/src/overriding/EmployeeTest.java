package overriding;

class Employee{
	void work(){
		System.out.println("Employee working");
	}
}
class Manager extends Employee{
	void work(){
		System.out.println("Manager Managing");
	}
}
class Security extends Employee{
	void work(){
		System.out.println("Security Watching");
	}

	void drill(){
		System.out.println("Performing drill");
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1 = new Manager();
		emp1.work();
		Employee emp2 = new Security();
		emp2.work();

		Employee emp3 = new Employee();

		System.out.println("Employees doing respective jobs");
		Employee[] empArr = {emp1,emp2,emp3};
		for(Employee emp : empArr){
			emp.work();
		}

		//emp2.drill();  				
		//Does not work as employee doesn't have drill functionality. Downcast to Security
		if (emp2 instanceof Security){
			((Security) emp2).drill();
		}  

	}
}