package com.assignment;

import java.util.*;

public class MOCK3_ArrayListtoStringArray
{
	public static void main(String[] args) {
		
		List l= new ArrayList<Integer>();
		int e=0, o=0;
		for(int i=0; i<args.length; i++){
			l.add(Integer.parseInt(args[i]));
		}
			
		int arr[]= convertToIntegerArray(l);
		
		for(int i=0; i<arr.length; i++)
		if((arr[i]%2)==0)
			e++;
		else
			o++;
			
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
			
		System.out.println("Odd="+o);
		System.out.println("Even="+e);

	}

	
	public static int[] convertToIntegerArray(List<Integer> l)
	{
		int arr[]= new int[(l.size())];
		Iterator<Integer> it= l.iterator();
		for(int i=0; i<l.size(); i++){
			arr[i]= it.next();
		}
		Arrays.sort(arr);
		return arr;
		
	}
}