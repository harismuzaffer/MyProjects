package com.day4;

public class Rectangle extends Shape {

	
	int l, b;
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return l*b;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(l+b);
	}

	public Rectangle(String color, int l, int b) {
		super(color);
		this.l= l;
		this.b= b;
		// TODO Auto-generated constructor stub
	}
	
	
}
