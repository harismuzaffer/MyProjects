package com.dec07;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("e:/hhh.txt");
		FileInputStream o= new FileInputStream(f);
		BufferedInputStream b= new BufferedInputStream(o);
		byte[] bb= new byte[3];
		b.read(bb);
		for(byte bbb: bb)
		System.out.print((char)bbb);
	}

}
