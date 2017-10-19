package com.dec07;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream f= new FileInputStream("e://hhh.txt");
			int data= 0;
			byte[] bytes= new  byte[10];
			StringBuilder sb= new StringBuilder();
			BufferedInputStream b= new BufferedInputStream(f);
			//FilterInputStream b= new BufferedInputStream(f);
			System.out.println(b.read(bytes, 2,8));
			for(int i: bytes)
			System.out.print((char)i);
//			while((data=b.read())!=-1){
//				//d= f.read();
//				sb.append((char)data);
//			}
//			System.out.println(sb);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
