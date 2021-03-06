package com.haris;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ac= new ClassPathXmlApplicationContext("com/haris/appContext.xml");
		ac.registerShutdownHook();
		
		Car c1= ac.getBean("car1", Car.class);
		System.out.println(c1.getEngine().getCc());
		System.out.println(c1.getEngine().getType());
		System.out.println(c1.getName()+"\n");
		
		Car c2= ac.getBean("car2", Car.class);
		System.out.println(c2.getEngine().getCc());
		System.out.println(c2.getEngine().getType());
		System.out.println(c2.getName());
		

	}

}
