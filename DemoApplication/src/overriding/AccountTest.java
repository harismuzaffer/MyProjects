package overriding;

public class AccountTest {
	public static void main(String[] args) {
		FDAccount fd1 = new FDAccount(8, 10000, 5);
		System.out.println(fd1.getAccountDetails());
	}
}
