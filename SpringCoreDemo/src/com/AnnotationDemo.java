package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
	public static void main(String[] args) {
		
		AbstractApplicationContext ac= new ClassPathXmlApplicationContext("com/appContext.xml");
		
		Car c1= ac.getBean("car", Car.class);
		System.out.println(c1.getEngine().getCc());
		System.out.println(c1.getEngine().getType());
		System.out.println(c1.getName()+"\n");
		
		
	}	

}
