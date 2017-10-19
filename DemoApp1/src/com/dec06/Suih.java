package com.dec06;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Suih {
	static int num = 2;
	static 
	{
		m1();
		System.out.println("The static block ");
		
	}
	static void m1()
	{
		System.out.println(var);
	}
	static int  var = 23;
	{
		System.out.println("The Instance block");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to your java program");
		System.out.println(var);
		StringBuffer sb= new StringBuffer("hello");
		sb.insert(2,"demo");
		System.out.println("hello "+new Integer(5)+4);			
	}
}
