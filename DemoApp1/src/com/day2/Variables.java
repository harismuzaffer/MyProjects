package com.day2;

public class Variables {

	int instanceVariable;
	static int staticVariable;
	final float PI= 3.14f;
	int Variables(){
		return 6;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables v1 = new Variables();
		System.out.println(v1.Variables());
	}

}