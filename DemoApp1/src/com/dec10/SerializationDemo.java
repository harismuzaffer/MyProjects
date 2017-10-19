package com.dec10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Employee e= new Employee("haris", 23);
		ObjectOutputStream o= new ObjectOutputStream(new FileOutputStream("e://haris.dat"));
		o.writeObject(e);
		o.flush();
		o.close();
	}

}
