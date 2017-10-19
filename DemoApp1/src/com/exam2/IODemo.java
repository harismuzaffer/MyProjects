package com.exam2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream o= new FileOutputStream("e:/j/demo.txt");
			byte[] b= {31,67,77};
			o.write(b,1,1);
			FileInputStream in= new FileInputStream("e:/j/demo.txt");
			int i= 0;
			while((i=in.read())!=-1){
				System.out.println(in.read());
				System.out.println(i);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
