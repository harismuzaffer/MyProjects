package com.dec10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CompleteList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l= new ArrayList();
		l.add("one");
		l.add("two");
		l.add("three");
		//l.add(65655);
		System.out.println(l);
		if(l.isEmpty())
			System.out.println("empty");
		else{
			Iterator<String> i= l.iterator();
			while(i.hasNext())
			System.out.println(i.next());
		}
//		if(l.contains("onee"))
//			System.out.println("onee is present");
//		else
//			System.out.println("no");
		List<String> l2= new ArrayList<String>();
		l2.add("one");
		l2.add("two");
		l2.add("three");
		if(l.equals(l2))
			System.out.println("equal");
		else
			System.out.println("no");
		
		for(ListIterator<String> it= l2.listIterator(); it.hasNext();)
		{
			System.out.println(it.next());
		}
		
		LinkedList<String> stack= new LinkedList<String>();
		stack.addFirst("haris");
		stack.addFirst("imran");
		stack.addLast("see");
		
		System.out.println(stack);
		System.out.println(stack.remove());
		System.out.println(stack);
			
	}

}
