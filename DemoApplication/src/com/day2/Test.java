package com.day2;

public class Test {
	public static void main(String[] args) {
		Account acc1 = new Account("test1",345.23f,10000);
		Account acc2 = new Account("test2",345.23f,6000);
		Account acc3 = new Account("test3",345.23f,234234);
		Account acc4 = new Account("test4",345.23f,213423);
		//System.out.println(acc1.getFormatAccDetails(true));
		//System.out.println(acc1.getFormatAccDetails(false));
		System.out.println(acc1);
	}

}
