package ademo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo extends Thread{

	public static void main(String[] args) throws IOException {
		hh t= new hh();
		String s= "hwe";
		StringBuffer g= new StringBuffer("");
		System.out.println(g);
	}
	public void run(){
		System.out.println("heooolle");
		System.out.println(Thread.currentThread().getName());
	}
}
class hh implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hhhh");
		System.out.println(Thread.currentThread().getName());
	}
	
}
