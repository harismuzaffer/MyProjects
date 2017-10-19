package com.dec06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RethrowDemo {

	static Scanner in= new Scanner(System.in);
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			demoRethrow();
		}
		catch(InputMismatchException e){
			System.out.println("re caught");
		}
		
	}
	static void demoRethrow(){
		try{
			i= in.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("caught here");
			throw e;
		}
	}

}
