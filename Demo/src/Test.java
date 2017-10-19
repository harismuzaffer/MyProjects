
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

import my.*;

public class Test extends Demo2{

	public static void main(String[] args) {
		
//		Demo2 d= new Demo2();
//		
//		System.out.println(d.h);
//		Collections.sort
		String s= "hello";
		String ss= "hello";
		String sss= new String("hello");
		System.out.println(sss.equals(ss));
		TreeSet<String> t= new TreeSet<>();
		t.add(s);
		t.add("zl");
		System.out.println(t);
		Iterator<String> s= t.iterator();
	
	}
}
