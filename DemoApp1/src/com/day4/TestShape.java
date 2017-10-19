package com.day4;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape c= new Circle("Blue", 4);
		System.out.println(c.color);
		System.out.println(c.getPerimeter());
		Shape r= new Rectangle("White", 5, 8);
		System.out.println(r.getArea());
		
		System.out.println(c.compareArea(r, r));
		String s= (String) new Object();
		Object ob= (Object)new String();
		//String ss= (Object)new String();
	}
}
