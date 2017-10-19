package com.dec06;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= new String("abc");
		String s2= new String("abc");
		System.out.println(s1==s2);
		Bean b1= new Bean("abc");
		Bean b3= new Bean("abc");
		System.out.println(b1.hashCode());
		System.out.println(b3.hashCode());
	}
}
class Bean{
	String s;
	Bean(String s){
		this.s= s;
	}
}
