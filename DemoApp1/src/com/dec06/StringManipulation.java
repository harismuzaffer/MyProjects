package com.dec06;

import java.util.StringTokenizer;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s= "hello world";
//		char[] arr= s.toCharArray();
////		for(char c: arr)
////			System.out.println(c);
//		System.out.println(s.replace("wor", "nohello"));
//		System.out.println(s.charAt(4));
//		System.out.println(s.concat("hkjfdkj"));
//		System.out.println(s.indexOf('l'));
//		System.out.println(s.lastIndexOf('l'));
//		StringBuffer s= new StringBuffer();
//		System.out.println(s);
//		s.append("hello");
//		System.out.println(s);
//		System.out.println(s.toString());
		String s= "http://11.45.77.55";
		StringTokenizer st= new StringTokenizer(s, ".://", false);
		while(st.hasMoreTokens())
		System.out.println(st.nextToken());
		
	}

}
