package com.day2;

public class Varaibles {
	int instanceVariables;
	static int staticVaraibles;
	final float PI = 3.14f;
	
	public static void method(){
		System.out.println();
		
	}
	
	
	
	public static void main(String[] args) {
		int localVariable=0;
		Varaibles v1 = new Varaibles();
		v1.instanceVariables =12;
		Varaibles v2 = new Varaibles();
		v2.instanceVariables =11;
		Varaibles v3 = new Varaibles();
		v3.instanceVariables =11;
	//	instanceVariables=10;
		staticVaraibles=3;
		System.out.println(localVariable);
		method();
		
	}

}
