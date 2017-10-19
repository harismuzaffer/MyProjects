package com.day3;

public class OveridingDemo {
	public static void main(String[] args) {
		Animal a1 = new cat();
		Animal a2 = new Dog();
		a1.displayType();
		a2.displayType();
		if(a2 instanceof Dog){
		Dog c = (Dog)a2;
		c.sound();
		}
		System.out.println("No exception");
	}}

class Animal{
	String type;
	String sound = "test";
	public void displayType(){
		System.out.println("its animal");
	}
}
class Dog extends Animal{
	String type;
	String sound ="bark";
	public void displayType(){
		System.out.println("its dog");
	}
	public void sound(){
		System.out.println("its dog "+sound);
	}
}
class cat extends Animal{
	String type;
	String sound ="meow";
	public void displayType(){
		System.out.println("its cat");
	}
	public void sound(){
		System.out.println("its cat "+sound);
	}
}
