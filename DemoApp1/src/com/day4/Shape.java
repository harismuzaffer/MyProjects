package com.day4;

public abstract class Shape implements ComparableShape {
	
	public String color;

	public Shape(String color) {
		super();
		this.color = color;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}

	@Override
	public boolean compareArea(Shape s1, Shape s2) {
		// TODO Auto-generated method stub
		return s1.getArea()==s2.getArea();
	}

	@Override
	public boolean compareParameter(Shape s1, Shape s2) {
		// TODO Auto-generated method stub
		return s1.getPerimeter()==s2.getPerimeter();
	}
	
}
