package com.day2;

public class Account {
	static int accNumber=101;
	 String accId;
	String accHolderName;
	float salary;
	int accBalance;
	Account(){
		this.accId = genarateAccNo();
	}
	Account(String accHolderName){
		this();
		this.accHolderName = accHolderName;
	}
	Account(String accHolderName,float salary){
		this(accHolderName);
		this.salary = salary;
	}
	Account(String accHolderName,float salary,int accBalance){
		this(accHolderName,salary);
		this.accBalance = accBalance;
	}
	
	
	public static String genarateAccNo(){
		return "ACN21"+accNumber++;
		
	}
	public void depositAmount(int amount){
		accBalance+=amount;
	}
	public String getFormatAccDetails(){
		String formatDetails = "Account Id "+accId+" Account Holder Name "+accHolderName+" salary "+salary;
		return formatDetails;
	}
	public String getFormatAccDetails(boolean withBalance){
		String formatDetailsWithBalance=getFormatAccDetails();
		if(withBalance){
			formatDetailsWithBalance+="Balance "+accBalance;
		}
		return formatDetailsWithBalance;
	}
	public String toString(){
		String formatDetailsWithBalance=getFormatAccDetails();
		
		return formatDetailsWithBalance;
	}
	
	

}
