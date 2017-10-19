package com.day5;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= new int[5];
		try{
			System.out.println(array[6]);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("array...");
		
	}

}
