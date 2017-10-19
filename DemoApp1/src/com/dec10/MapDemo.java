package com.dec10;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> tm= new TreeMap<Integer, String>();
		Map<Integer, String> hm= new HashMap<Integer, String>();
		
		tm.put(101, "haris");
		tm.put(121, "adam");
		tm.put(108, "younus");
		System.out.println(tm);
		
		hm.put(133, "java");
		hm.put(113, "cpp");
		hm.put(118, "python");
		System.out.println(hm);
		
	}

}
