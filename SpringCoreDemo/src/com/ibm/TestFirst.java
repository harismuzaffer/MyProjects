package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFirst {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("appContext.xml");
		First first= ac.getBean("first", First.class);
		first.setMsg("first from java");
		first.welcome();
		First first2= ac.getBean("first", First.class);
		first2.welcome();
		
		System.out.println(first.equals(first2));
		
		
		First second= ac.getBean("second",First.class);
		First second2= ac.getBean("second",First.class);
		second.setMsg("second from java");
		second.welcome();
		second2.setMsg("second from java2");
		second2.welcome();
		System.out.println(second.equals(second2));
		
	}

}
