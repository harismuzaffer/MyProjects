package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/appContext.xml");
		
		Car c1= ac.getBean("car", Car.class);
		System.out.println(c1.getEngine().getCc());
		System.out.println(c1.getEngine().getType());
		System.out.println(c1.getName()+"\n");	
		
		
		AnnotationConfigApplicationContext c= new AnnotationConfigApplicationContext(ConfigBean.class);
		
		Car c2= c.getBean("car", Car.class);
		System.out.println(c2.getEngine().getCc());
		System.out.println(c2.getEngine().getType());
		System.out.println(c2.getName()+"\n");

	}

}
