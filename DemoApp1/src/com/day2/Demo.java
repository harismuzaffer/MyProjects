package com.day2;

public class Demo 
{
	static int c=0;
	public static void main(String[] args) 
	{
	
		int[] arr= new int[4];
		int flag=1;
		//Scanner in= new Scanner(System.in);
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<i; j++){
				if(Integer.valueOf(args[i])== arr[j])
					flag=0;
					break;
			}
			if(flag==1)
			arr[i]= Integer.valueOf(args[i]);
			c++;
		}
		//System.out.println(kape1.addUniqueEven(arr, arr.length));
	
	}
}
