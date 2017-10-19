package com.day4;

public class Circle extends Shape {

	
	int radius;
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI* radius* radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2* Math.PI* radius;
	}

	public Circle(String color, int r) {
		super(color);
		this.radius= r;
		// TODO Auto-generated constructor stub
	}
	
}
