package com.vijay;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout1= new FileOutputStream("e://demo2.txt");
			FileOutputStream fout2= new FileOutputStream("e://demo3.txt");
			ByteArrayOutputStream bout= new ByteArrayOutputStream();
			bout.write(98);
			bout.writeTo(fout1);
			bout.writeTo(fout2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
