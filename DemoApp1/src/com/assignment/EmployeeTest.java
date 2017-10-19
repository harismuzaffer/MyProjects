package com.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeTest {

	static int ch;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Employee e= null;
		System.out.println("1: Save Record\t 2: Retrieve Record\n3: Delete File\t 4: Exit");
		Scanner input= new Scanner(System.in);
		ch= input.nextInt();
		FileWriter o= null;
		FileReader in= null;
		while(true){
			switch(ch){
				case 1:
					e= new Employee();
					e.saveEmployee();
					o= new FileWriter("e://emp.txt");
					o.write(String.valueOf("["+e.id)+", ");
					o.write(e.name+", ");
					o.write(e.address+"]\n");
					o.close();
					break;
				case 2:
					in= new FileReader("e://emp.txt");
					int d= 0;
					while((d=in.read())!=-1){
						System.out.print((char)d);
					}
					in.close();
					break;
				case 3:
					File f= new File("e://emp.txt");
					System.out.println(f.delete());
					break;
				case 4:
					break;
			}
			System.out.println("1: Save Record\t 2: Retrieve Record\n 3: Delete File\t 4: Exit");
			ch= input.nextInt();
			if(ch==4)
				break;
		}
	}

}
