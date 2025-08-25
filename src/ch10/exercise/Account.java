package ch10.exercise;

public class Account {
	private String accountNo;
	private String accountOwner;
	private long balance;
	private String password; // 4자리 숫자형태

	public Account(String accountNo, String accountOwner, long balance, String password) {
		super();
		this.accountNo = accountNo;
		this.accountOwner = accountOwner;
		this.balance = balance;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	// 접근자
	public String getAccountNo() {
		return accountNo;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public long getBalance() {
		return balance;
	}

	public long setBalance(long balance) {
		return this.balance = balance;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s \t %s \t %d", accountNo, accountOwner, balance);
	}

}
