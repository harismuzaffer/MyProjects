package com.day4;

interface I1{
	void m1();
	void m2();
}

interface I2{
	void m3();
}
class C implements I1, I2{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3");
	}

	@Override
	public final void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
	}
	
}

public class InterfaceDemo {
	public static void main(String[] args) {
		I1 obj1= new C();
		obj1.m1();
		obj1.m2();
	}
}