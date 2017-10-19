package com.day3;


public class SBAccount extends Account{
	int accountBal;
	
	SBAccount(int accountNo, double accountBalance, double intRate){
		super(accountNo,accountBalance,intRate);
	
	}
	
	
	//minimum balance of Rs 500
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
	public static void main(String[] args) {
		SBAccount sb1 = new SBAccount(123,10000,10.0);
		sb1.accountNo=12;
	}
}
