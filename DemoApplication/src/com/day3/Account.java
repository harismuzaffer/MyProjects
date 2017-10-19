package com.day3;

public class Account {
	protected int accountNo;
	protected double accountBal;
	protected double intRate;
	
	public Account(int accountNo, double accountBal, double intRate) {
		
		this.accountNo = accountNo;
		this.accountBal = accountBal;
		this.intRate = intRate;
	}

	
	
	
	
	public double calculateInterest(double amount){
		return amount * intRate /100;
	}

	/*public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setAccountBal(double accountBal) {
		this.accountBal = accountBal;
	}

	public void setIntRate(double intRate) {
		this.intRate = intRate;
	}*/
	
	public String getAccountDetails(){
		String str = "Account no   : " + accountNo + "\n" 
                   + "Balance      : " + accountBal + "\n" 
                   + "Interest Rate: " + intRate;
	   return str;
	}
	
}