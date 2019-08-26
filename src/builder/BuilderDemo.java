package builder;

public class BuilderDemo {

	public static void main(String[] args) {
		BankAccount account = new BankAccount.Builder(12)
									.addName("john")
									.addType("checking")
									.build();
		System.out.println(account);
	}

}
