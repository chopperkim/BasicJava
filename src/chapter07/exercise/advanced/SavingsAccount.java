package chapter07.exercise.advanced;

public class SavingsAccount extends BankAccount {
	private double interestRate; // 이자율(여기서는 월이율)

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	public void updateBalance(int period) {
		balance += balance * interestRate * period;
	}
}
