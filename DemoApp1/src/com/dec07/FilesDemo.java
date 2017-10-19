package com.dec07;
import java.io.File;
import java.io.IOException;


public class FilesDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		File f1= new File("E://");
		for(String s : f1.list());
		//System.out.println(s);
		File f2= new File("E://hhh.txt");
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No access");
		}
		File f3= new File("E://hiolo.txt");
		f2.renameTo(f3);
	}

}
