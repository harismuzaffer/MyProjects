package aop;

import org.springframework.stereotype.Component;

@Component
public class Account {

	private double bal;
	
	public double getBal(){
		return bal;
	}
	
	
	public void deposit(double amount){
		bal+= amount;
		System.out.println(amount+" deposit done");
	}
	
	public int withdraw(double amount){
		if(amount< 0 ){
			System.out.println(amount+" withraw not done negative");
			throw new IllegalArgumentException("smount cant be negative");
		}
		if(amount> bal){
			System.out.println(amount+" withraw not done");
			return 0;
		}
		bal-= amount;
		System.out.println(amount+" withraw done");
		return 1;
	}
}
