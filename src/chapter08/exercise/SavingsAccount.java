package chapter08.exercise;

public class SavingsAccount extends BankAccount {
	private double interestRate; // 이자율(여기서는 월이율)

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	public void updateBalance(int period) {
		balance += balance * interestRate * period;
	}
	@Override
	public String getAccountType() {
		return "저축예금";
	}
}
