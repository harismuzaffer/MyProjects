package com.day4.abstraction;

public class TestShape {

    public static void main(String[] args) {
    	Shape shape1 = new Circle("black",5);
       
        Shape shape2 = new Rectangle("grey",4,8);
        
       System.out.println(shape1.compareArae(shape1, shape1));
       System.out.println(shape1.comparePerimeter(shape1, shape2));
    }
}
