package com.dec10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st= new Stack<String>();
		st.push("haris");
		st.push("mrs. shreya");
		//System.out.println(st.peek());
		
		Queue<String> q= new LinkedList<String>();
		q.add("hello");
		q.offer("yres");
		System.out.println(q);
		
		
		Set<String> hs= new HashSet<String>();
		Set<String> ts= new TreeSet<String>();
		Set<String> lhs= new LinkedHashSet<String>(); // ordering no sorting
		
		hs.add("haris");   // no ordering no sorting
		hs.add("bilal");
		hs.add("shreya");
		hs.add("ttt");
		hs.add("younus");
		
		ts.add("haris");   // ordered and sorted
		ts.add("bilal");
		ts.add("shreya");
		
		lhs.add("haris");   // ordered and sorted
		lhs.add("bilal");
		lhs.add("shreya");
		//System.out.println(ts);
		
		
//		for(Iterator<String> it= ts.iterator(); it.hasNext();){
//			System.out.println(it.next());
//		}
//		
//		System.out.println("\n");
//		
//		for(Iterator<String> it= hs.iterator(); it.hasNext();){
//			System.out.println(it.next());
//		}
//		
//		System.out.println("\n");
//		
//		for(Iterator<String> it= lhs.iterator(); it.hasNext();){
//			System.out.println(it.next());
//		}
	}
}
