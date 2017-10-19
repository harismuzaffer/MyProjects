package com.day2;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1= new Product("Mobile", 600.55f, "Electronics");
		System.out.println(p1.calculateDiscount()+"\n"+p1.ShowDetails());
	}

}
