package com.dec07;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream p= new PrintStream("e://fgt.txt");
		p.print(101);
		p.format("%s", "hdeghkjhfgj");
		
	}

}
