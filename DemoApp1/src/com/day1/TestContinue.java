package com.day1;

public class TestContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum= 0;
		int number= 0;
		String str = "sum of mul of 4";
		
		while(true){
			number++;
			
			if(number % 4 !=0)
				continue;
			sum+=number;
			str+=" +" + number;
			if(sum >100){
				break;
			}
		}
		System.out.println(str+"="+sum);
	}

}
