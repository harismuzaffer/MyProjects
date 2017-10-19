package com.day4.abstraction;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(String color, double width, double height) {
    	super(color);
        this.width = width;
        this.height = height;
    }

    // Return area
    public double getArea() {
        return width * height;
    }

    // Return perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
