package com.vijay;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CharArrayWriter {
	public static void main(String[] args) {
		try{
			FileOutputStream fout= new FileOutputStream("e://demo.txt");
			String s= "hey there";
			byte[] b= s.getBytes();
			fout.write(b);
			FileInputStream fin= new FileInputStream("e://demo.txt");
			int i=0;
			while((i=fin.read())!=-1)
			//int i= fin.read();
			System.out.print((char)i);
		}
		catch(Exception e){
			
		}
	}
}
