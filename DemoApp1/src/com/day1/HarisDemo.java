package com.day1;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class HarisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		int n;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the choice.. 1:Abs 2:Factorial 3:Fibanacci 4:Palindrome");
		ch = in.nextInt();
		System.out.println("Enter the no");
		n= in.nextInt();
		
		switch(ch){
		case 1:
			System.out.println("Absolute value= "+((-1)*n));
			break;
		case 2:
			int m=n;
			if(m<0){
				System.out.println("Enter a positive no.");
				break;
			}
			long f=1l;
			while(m>0){
				f= f*m;
				m--;
			}
			if(f==0)
				System.out.println("Result out of range");
			else
			System.out.println("factorial= "+f);
			break;
		case 3:
			int a=0, b=0, c=1;
			System.out.println("Fibonacci series is: ");
			while(c<=n){
				System.out.print(c+" ");
				a= b;
				b= c;
				c= a+b;
			}
			break;
		
		case 4:
			int r=0, h=n;
			while(h!=0){
				r= r*10;
				r= r+ h%10;
				h= h/10;
			}
			if(r==n)
				System.out.println("This is a palindrome");
			else
				System.out.println("Not a palindrome");
			
		default:
			System.out.println("invalid functionality");
			break;
			
				
		}
	}

}
