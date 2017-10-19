package overriding;

public class Account {
	private static int accountCounter = 1000;
	protected int accountNo;
	protected double accountBal;
	protected double intRate;

	public Account(double intRate) {
		super();
		this.accountNo = ++accountCounter;
		this.accountBal = 0;
		this.intRate = intRate;
	}

	public String getAccountDetails(){
		String str = "Account no\t\t: " + accountNo + "\n" 
				+ "Balance\t\t\t: " + accountBal + "\n" 
				+ "Interest Rate\t\t: " + intRate;
		return str;
	}

	//simple interest calculated yearly
	public double calculateInterest(double amount){
		return amount * intRate /100;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getAccountBal() {
		return accountBal;
	}

	public double getIntRate() {
		return intRate;
	}

	public void setIntRate(double intRate) {
		this.intRate = intRate;
	}
}