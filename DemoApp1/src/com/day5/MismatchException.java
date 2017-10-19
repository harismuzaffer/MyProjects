package com.day5;

import java.util.Scanner;

public class MismatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner in= new Scanner(System.in);
		try{
			i= Integer.parseInt(in.next());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
