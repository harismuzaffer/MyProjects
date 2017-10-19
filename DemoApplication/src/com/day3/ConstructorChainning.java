package com.day3;

public class ConstructorChainning extends Parent {
	int i=5;
	public void method1(){
		System.out.println(++i);
		System.out.println(super.i--);
		System.out.println(j);
		method2();
	}
	
	
	public static void main(String[] args) {
		ConstructorChainning child = new ConstructorChainning();
		child.method1();
	}
}

class Parent {
	int i=10;
	int j =12;
	public void method2(){
		System.out.println(i);
	}
	
}


