package chapter08.exercise;

public abstract class BankAccount {
	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	/**
	 * 예금(입금)
	 * @param amount 입금액
	 */
	public void deposit(int amount) {
		balance += amount;
	}
	/**
	 * 출금
	 * @param amount 출금액(출금액이 현재 잔액보다 클 수 없다.)
	 * @return
	 */
	public boolean withdraw(int amount) {
		if (amount > balance) {
			return false;
		}
		balance -= amount;
		return true;
	}
	/**
	 * 이체
	 * @param amount 이체금액 (이체금액이 현재 잔액보다 클 수 없다.)
	 * @param otherAccount 이체할 계좌번호
	 * @return
	 */
	public boolean transfer(int amount, BankAccount otherAccount) {
//		if (amount > balance) {
//			return false;
//		}
		withdraw(amount); // balance -= amount;
		otherAccount.deposit(amount); // otherAccount.balance += amount;
		return true;
	}
	/**
	 * 계좌의 종류를 반환하는 메소드
	 * @return SavingsAccount => 저축예금, CheckingAccount => 당좌예금
	 */
	public abstract String getAccountType();
	
	@Override
	public String toString() {
		return String.format("%,d", balance);
	}
}
