package com.day3;

public abstract  class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1= new Dog();
		Animal a2= new Cat();
		a1.displayType();
		a2.displayType();
		String s= new String();
		Object o1= new Object();
		Object o2= new Object();
		System.out.println(o1.equals(o2));
	}

}

class Animal{
	String type;
	String sound= "test";
	public void displayType(){
		System.out.println("its animal");
	}
}

class Dog extends Animal{
	String type;
	String sound= "test";
	public void displayType(){
		System.out.println("its dog");
	}
}

class Cat extends Animal{
	String type;
	String sound= "test";
	public void displayType(){
		System.out.println("its cat");
	}
}
