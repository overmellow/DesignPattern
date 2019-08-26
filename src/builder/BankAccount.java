package builder;

public class BankAccount {
	private int accountNo;
	private String name;
	private String type;
	
	private BankAccount() {}
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", name=" + name + ", type=" + type + "]";
	}

	public static class Builder {
		private int accountNo;
		private String name;
		private String type;
		
		public Builder(int accountNo) {
			this.accountNo = accountNo;
		}
		
		public Builder addName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder addType(String type) {
			this.type = type;
			return this;
		}
		
		public BankAccount build() {
			BankAccount account = new BankAccount();
			account.accountNo = this.accountNo;
			account.name = this.name;
			account.type = this.type;
			return account;
		}
	}

}
