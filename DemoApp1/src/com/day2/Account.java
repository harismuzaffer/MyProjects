package com.day2;

public class Account {

	static int accNumber= 101;
	String accId;
	String accHolder;
	float salary;
	int accBalance;
	
	Account(String accHolder){
		this.accId= getAccountNumber();
		this.accHolder= accHolder;
	}
	Account(String accHolder, float salary){
		this(accHolder);
		this.salary= salary;
	}
	
	Account(String accHolder, float salary, int accBalance){
		this(accHolder, salary);
		this.accBalance= accBalance;
	}
	public static String getAccountNumber(){
		return "ACN21"+accNumber++;
	}
	public String getFormatDetails(){
		String s= " Account Id: "+accId+" AccountHolderName:"+accHolder+" Salary:"+salary;
		return s;
	}
	public void depositAmount(int amount){
		accBalance+= amount;
	}
	public String getFormatDetails(boolean flag){
		String getFormatDetailsWithBal= getFormatDetails();
		if(flag){
			getFormatDetailsWithBal+= " Balance:"+accBalance;
		}
		return getFormatDetailsWithBal;
	}

}
