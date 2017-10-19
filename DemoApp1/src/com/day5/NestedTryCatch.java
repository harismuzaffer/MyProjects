package com.day5;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String s= null;
			try{
				int i=9;
				System.out.println(i/0);
				System.out.println(s.equals("tsrt"));
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}	
		}
		catch(NullPointerException e){
			System.out.println("outer");
		}
	}

}
