package com.day3;

public class FDAccount extends Account {
	
	int years;
	
	// constructor
	public FDAccount(int accountNO, double accountBal, double intRate, int years) {
		super(accountNO, accountBal, intRate);
		this.years= years;
	}

	public double calculateInterest(){
		return (accountBal*(Math.pow((1+intRate/1), 1*intRate))) - accountBal;	
	}
}
