package com.dec06;

import java.util.InputMismatchException;
import java.util.Scanner;

class CustomerDemo{
	final int IDGEN=100;
	int id;
	static int noOfCustomers;
	String name;
	String email;
	String address;
	
	public CustomerDemo(int id, String name, String email, String address){
		this.id= (id+IDGEN)%999;
		this.name= name;
		this.email= email;
		this.address= address;
		noOfCustomers++;
	}
	public CustomerDemo(){
	}
	public void getDetails(){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter Customer ID");
		try{
			id= (in.nextInt()+IDGEN)%200;
		}
		catch(InputMismatchException e){
			System.out.println("ID can only be an integral");
		}
		System.out.println("Enter Customer Name");
		name= in.next();
		System.out.println("Enter Customer Email");
		email= in.next();
		System.out.println("Enter Customer Address");
		address= in.next();
		noOfCustomers++;
	}
	
	public static String showDetails(CustomerDemo c){
		return "ID:"+c.id+", Name:"+c.name+", Email:"+c.email+", Address:"+c.address;
	}
} 

class CustomerOrder extends CustomerDemo implements Product{
	String productName;
	float productPrice;
	int discount;
	
	public void productDetails(CustomerOrder co, int discount){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter Product Name");
		co.productName= in.next();
		System.out.println("Enter Product Price");
		try{
			co.productPrice= in.nextFloat();
		}
		catch(InputMismatchException e){
			System.out.println("Price can only be Numeric");
		}
		co.discount= discount;
	}
	
	public String Billing(CustomerOrder co){
			return "Cutomer Details=  "+co.showDetails(co)+"\nDiscounted Price:"+(co.productPrice - (co.productPrice*discount)/100);
		}
}
class CustomerTest {
	public static void main(String str[]){
		CustomerOrder c1= new CustomerOrder();
		c1.getDetails();
		c1.productDetails(c1, 10);
		//System.out.println(CustomerDemo.showDetails(c1));
		System.out.println(c1.Billing(c1));
	}
}










