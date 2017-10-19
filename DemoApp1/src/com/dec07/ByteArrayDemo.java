package com.dec07;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "test";
		byte[] bytes= s.getBytes();
//		InputStream in= new ByteArrayInputStream(bytes);
//		int d;
//		try {
//			while((d=in.read())!=-1)
//				System.out.println((char)d);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for(int c: bytes)
			System.out.println((char)c);
	}

}
