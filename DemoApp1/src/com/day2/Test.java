package com.day2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1= new Account("test", 324524.55f, 1000);
		Account acc2= new Account("test", 3278644.55f, 1200);
		Account[] accs= {acc1, acc2};
		acc2.depositAmount(3000);
		for(Account acc: accs)
			System.out.println(acc.getFormatDetails(true));
	}

}
