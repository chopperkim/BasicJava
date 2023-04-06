package chapter10.exercise;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy; // 연결된 저축 계좌(SavingsAccount)

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	@Override
	public boolean withdraw(int amount) {
		if (amount > balance) {
			protectedBy.balance -= amount - balance;
			balance = 0;
		} else {
			balance -= amount;
		}
		return true;
	}

	@Override
	public String getAccountType() {
		return "당좌예금";
	}
}






