package com.day1;

public class LoopingConstructs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cList= {"ind", "pak"};
		for(int i=0; i<cList.length; i++){
			System.out.println(cList[i]);
		}
		
		//enhance for
		
		for(String ss:cList){
			System.out.println(ss);
		}
		
		// while loop
		
		int c= 0;
		int s= 0;
		while(c<10){
			s+=c;
			c++;
		}
		System.out.println("sum= "+s);
		
		// do-while
		c=0;
		s=0;
		do{
			s+=c;
			c++;
		}while(c<=100);
		System.out.println("sum "+s);
		int[][] arr= {
				{3,4,1},
				{3,55,7,11},
				{345,6}
		};
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		}
	}

}
