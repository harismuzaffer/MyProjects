package com.dec06;

import java.util.Scanner;

public class AssertionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int i= in.nextInt();
		withDraw(i);
	}
	static void withDraw(int n){
		int bal= 100;
		assert n<bal:"nooo";
	}

}
