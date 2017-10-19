package com.dec06;

public class ExceptionConditions {
	public static void main(String[] args) {
		doStuff();
		System.out.println("Main method");
	}
	
	static public void doStuff()
	{
		doMoreStuff();
		System.out.println("Do stuff");
	}
	
	static void doMoreStuff()
	{
		System.out.println(10/0);
		System.out.println("DoMoreStuff");
	}
}
