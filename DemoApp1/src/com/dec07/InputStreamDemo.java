package com.dec07;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream f= new FileInputStream("e://hhh.txt");
			BufferedInputStream b= new BufferedInputStream(f);
			int d= 0;
			StringBuilder sb= new StringBuilder();
			while((d=b.read())!=-1){
				//d= f.read();
				sb.append((char)d);
			}
			System.out.println(sb);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
