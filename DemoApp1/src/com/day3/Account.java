package com.day3;

public class Account {
	protected int accountNO;
	protected double accountBal;
	protected double intRate;
	
	public Account(int accountNO, double accountBal, double intRate) {
		this.accountNO = accountNO;
		this.accountBal = accountBal;
		this.intRate = intRate;
	}
	
	public double calculateInterest(){
		return (accountBal*intRate)/100;
	}
	
	
}
