package com.dec10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream i= new ObjectInputStream(new FileInputStream("e://haris.dat"));
		Employee emp= (Employee)i.readObject();
		System.out.println(emp);
	}

}
