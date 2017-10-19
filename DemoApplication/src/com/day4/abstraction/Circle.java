package com.day4.abstraction;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
    	super(color);
        this.radius = radius;
    }

    // implementing abstract method getArea() of Shape 
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Return perimeter 
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Print the circle info 
    public void printCircle() {
        System.out.println(" The radius of circle is  " + radius);
    }
}