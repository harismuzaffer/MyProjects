package com.vijay;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferOutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileOutputStream fout= new FileOutputStream("e://demo.txt");
			BufferedOutputStream bout= new BufferedOutputStream(fout);
			String s= "hey there";
			byte[] b= s.getBytes();
			bout.write(b);  // write all the data to fout
			bout.flush();
			bout.close();
			fout.close();
			FileInputStream fin= new FileInputStream("e://demo.txt");
			BufferedInputStream bin= new BufferedInputStream(fin);
			int i=0;
			while((i=fin.read())!=-1)
			//int i= fin.read();
			System.out.print((char)i);
		}
		catch(Exception e){
			
		}
	}

}
