package com.dec10;

import java.io.Serializable;

public class Employee implements Serializable{
	String name;
	int age;
	Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Name="+name+" and Age = "+age;
	}
}
