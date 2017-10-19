package com.dec07;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream f= new FileOutputStream("E://kkk.txt", false);
		BufferedOutputStream b= new BufferedOutputStream(f);
		DataOutputStream d= new DataOutputStream(b);
		String s= "Welcome to ice";
		//byte[] bytes= s.getBytes();
		//d.writeBytes(s);
		d.writeBytes("ainkdf");
		d.write((int)67);
		d.flush();
		d.close();
	}
}
