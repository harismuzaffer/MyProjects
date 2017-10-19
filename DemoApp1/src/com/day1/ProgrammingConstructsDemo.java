package com.day1;

public class ProgrammingConstructsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if-else
		int a= 11;
		if(a%2==0){
			System.out.println("number is even");
		}
		else
			System.out.println("number is odd");
		//nested if-else(largest of three
		int x=12, y=78, z=767;
		if(x>y){
			if(x>z)
				System.out.println("x >");
			else
				System.out.println("z >");
		}
		else{
			if(y>z){
				System.out.println("y >");
			}
			else
				System.out.println("z >");
		}
		// else-if ladder ... 
		int grade= 65;
		if(grade>=70){
			System.out.println("distinction");
		}
		else if(grade>=50){
			System.out.println("first class");
		}
		else if(grade>=35){
			System.out.println("second class");
		}
		else
			System.out.println("fails");
		
	}

}
