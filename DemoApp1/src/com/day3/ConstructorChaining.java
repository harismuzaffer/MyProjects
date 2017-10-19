package com.day3;

public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c= new Child2();
	}

}
class Child2 extends Child1{
	Child2(){
		System.out.println("child2");
	}
}

class Child1 extends Parent{
	Child1(){
		System.out.println("child1");
	}
}

class Parent{
	Parent(){
		System.out.println("parent");
	}
}

