package com.day4.abstraction;

public abstract class Shape implements ComparableShape{

    private String color;
    
     public Shape(String color) {
		this.color = color;
	}

	/** Abstract method getArea */
     protected abstract double getArea();

    /** Abstract method getPerimeter */
    protected abstract double getPerimeter();

    // Return a string representation of this object
    public String toString() {
        return "Color: " + color;
    }

	@Override
	public boolean compareArae(Shape s1, Shape s2) {
		
		return s1.getArea()==s2.getArea();
	}

	@Override
	public boolean comparePerimeter(Shape s1, Shape s2) {
		// TODO Auto-generated method stub
		return s1.getPerimeter()==s2.getPerimeter();
	}
}
