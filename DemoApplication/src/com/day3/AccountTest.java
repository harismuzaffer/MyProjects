package com.day3;

public class AccountTest {
	public static void main(String[] args) {
		SBAccount sb1 = new SBAccount(123,10000,10.0);
		
		System.out.println(sb1.withdraw(500));
		System.out.println(sb1.calculateInterest(1000));
		System.out.println(sb1.getAccountDetails());
	}
}
