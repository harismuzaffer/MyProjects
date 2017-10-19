package com.day1;

public class LoopingConstructs {
	
	
	public static void main(String[] args) {
		String[] countryList = {"India","China","US","UK","JAPAN"};
		System.out.println("Basic For Loop");
		for (int i = 0; i < countryList.length; i++) {
			System.out.print(countryList[i]+"\t");
		}
		System.out.println();
		System.out.println("****************************************");
		System.out.println("Enhanced for Loop");
		for(String s :countryList){
			System.out.print(s+"\t");
		}
		
		System.out.println();
		System.out.println("While Loop");
		int sum = 0;
        int count = 1;
        
        while (count <= 50) {
            sum += count;
            count++;
        }
        System.out.println("Sum of 50 numbers is: " + sum);
        
        
        //do while  demo
        int countData=0;
        int sumData=0;
        do{
        	sumData += countData;
        	countData++;
        }while(countData<=100);
        
        System.out.println("Sum of 100 numbers is: " + sumData);
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
}
