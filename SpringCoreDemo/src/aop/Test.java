package aop;

import jdbc.CountryDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ApplicationContext ac= new ClassPathXmlApplicationContext("aop/demo.xml");
		
		Account a= ac.getBean("account", Account.class);
		a.deposit(200);
		a.withdraw(70);
		System.out.println(a.getBal());
		
	}

}
