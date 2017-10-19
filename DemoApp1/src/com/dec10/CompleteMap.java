package com.dec10;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CompleteMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m= new LinkedHashMap<String, String>();
		m.put("sgr", "lchowk");
		m.put("sopore", "mtown");
		m.put("baramulla", "yss");
		System.out.println(m);
		System.out.println(m.remove("sgr"));
		Object s= m.get("sgr");
		System.out.println(s);
		System.out.println(m.containsKey("sopore"));
		System.out.println(m.containsValue("lchowk"));
		System.out.println(m.size());
		
		Collection<String> c= m.values();
		Iterator<String> it= c.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		Set<String> set= m.keySet();
		Iterator<String> it2= set.iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
		m.clear();
		System.out.println(m);
	}

}
