package sample;

public class Arithmetic {
	int num1, num2;
	int sum;
	int prod;
	
	public Arithmetic() {
		num1 = 0;
		num2 = 0;
		sum = 0;
		prod = 0;
	}
	
	public int add(int n1, int n2){
		num1= n1;
		num2= n2;
		sum= n1+n2;
		return sum;
	}
	
	public int multiply(int n1, int n2){
		num1= n1;
		num2= n2;
		prod= n1*n2;
		return prod;
	}
	
	public boolean decide(int n1, int n2){
		if(n1>n2)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
	}
	
	
}











