package ademo;

import java.util.*;

public class StringOccurancesII {

	public static void main(String[]args){

		Scanner in= new Scanner(System.in);
		String s1= in.next();
		String s2= in.next();
		System.out.println(getSubstring(s1, s2));
		List<Integer> inn= new ArrayList<Integer>();
		
	}
	
	public static int getSubstring(String s, String s1)
	{
		
		int c=0;
		String h= s.substring(0);
		while(h.contains(s1)){
			if(h.contains(s1))
				c++;
			h= h.substring(h.indexOf(s1));
			if(h.equals(s1))
				break;
			
		}
		return c;
		
	}
}