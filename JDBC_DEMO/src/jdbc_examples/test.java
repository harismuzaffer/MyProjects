package jdbc_examples;

import java.io.File;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a aa= new a();
		double d= 3.4;
		double dd= 4.4;
		System.out.println(((int)Math.floor(d)) * ((int)(Math.round(dd))));
	}

}
class a extends b{
	a(){
		this("this");
		System.out.println("sub");
	}
	a(String s){
		System.out.println(s);
	}
}

class b{
	b(){
		System.out.println("base");
	}
}