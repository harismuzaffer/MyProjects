import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String []args){

		Scanner in= new Scanner(System.in);
		int n= in.nextInt();
		HashMap<Integer, Integer> details= new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++)
			details.put(in.nextInt(), in.nextInt());		
		TreeMap<Integer, String> grade= Usermaincode.calculateGrade(details);
		Set keys= grade.keySet();
		Iterator<Integer> it= keys.iterator();
		while(it.hasNext()){
			int i= it.next();
			System.out.println(i);
			System.out.println(grade.get(i));
		}
	
	}
}


class Usermaincode
{
	public static TreeMap<Integer, String> calculateGrade (HashMap<Integer,Integer> hm){
	
		TreeMap<Integer, String> grade= new TreeMap<Integer, String>();
		int n= hm.size();
		Set keys= hm.keySet();
		int arr[]= new int[n];
		
		Iterator<Integer> it= keys.iterator();
		for(int i=0; it.hasNext(); i++){
			arr[i]= it.next();
		}
		Collection<Integer> values= hm.values();
		Iterator<Integer> itt= values.iterator();
		String arrr[]= new String[n];
		for(int i=0; itt.hasNext(); i++){
			int m= (Integer)itt.next();
			if( m >= 80)
				arrr[i]= "GOLD";
			else if( m <80 && m<=60)
				arrr[i]= "SILVER";
			else if( m <60 && m<=45)
				arrr[i]= "BRONZE";
			else
				arrr[i]= "FAIL";
		}
		for(int i=0; i<n; i++){
			grade.put(arr[i], arrr[i]);
		}
		return grade;
				
	}
}