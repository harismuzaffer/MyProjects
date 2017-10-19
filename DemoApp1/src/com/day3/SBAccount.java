package com.day3;

public class SBAccount extends Account{
	
	
	// constructor
	SBAccount(int accountNO, double accountBal, double intRate) {
		super(accountNO, accountBal, intRate);
	}
	public boolean withdraw(double withdrawAmt){
		if((accountBal - withdrawAmt) >= 500){
			accountBal -= withdrawAmt;
			return true;
		}
		return false;
	}
	public void deposit(double depositAmt){
		accountBal += depositAmt;
	}
}
