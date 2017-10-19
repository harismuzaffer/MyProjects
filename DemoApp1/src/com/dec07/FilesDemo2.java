package com.dec07;

import java.io.File;
import java.io.IOException;

public class FilesDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f= new File("E://hello.txt");
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		File dir= new File("E://");
		for(File ff: dir.listFiles()){
			if(ff.isFile())
				System.out.println("Filename: "+ff.getName());
			if(ff.isDirectory())
				System.out.println("DirName: "+ff.getName());
		}			
	}

}
