package overriding;

public class FDAccount extends Account{
	private double principalAmount;
	private int duration;
	private double maturityAmount;

	public FDAccount(double intRate, double principalAmount, int duration) {
		//Constructor chaining
		super(intRate);
		this.accountBal = principalAmount; 
		this.principalAmount = principalAmount;
		this.duration = duration;
		this.maturityAmount = calculateMaturityAmount();
	}

	@Override
	public double calculateInterest(double amount) {
		//yearly compounding formula(A = P(1+r)^t) 
		double matAmount = principalAmount * Math.pow((1 + intRate * 0.01),duration);
		return matAmount - principalAmount;
	}

	private double calculateMaturityAmount(){
		return principalAmount + calculateInterest(principalAmount);
	}

	@Override
	public String getAccountDetails() {
		String str = super.getAccountDetails();
		str += "\nAmount Deposited\t: " + principalAmount + "\n" 
				+ "Deposit Duration\t: " + duration + "\n" 
				+ "Maturity Amount\t\t: " + maturityAmount;

		return str;
	}
}