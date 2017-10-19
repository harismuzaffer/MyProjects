package com.day3;


public class AccountsTest {
	public static void main(String[] args) {
		SBAccount sb1 = new SBAccount(113, 6000.4, 7);
		sb1.deposit(1000);
		System.out.println(sb1.withdraw(500));
		System.out.println(sb1.calculateInterest());
		
		Account fd1= new FDAccount(456, 76700.5, 8, 3);
		System.out.println(fd1.calculateInterest());
	}
}

