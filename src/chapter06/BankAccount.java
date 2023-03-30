package chapter06;

public class BankAccount {
	static int balance;// 잔액
	String name;
	
	// 입금 메소드
	static void deposit(int amount) {
		balance += amount;
//		name = "홍길동";
	}
	// 출금 메소드
	void withdraw(int amount) {
		balance -= amount;
		name = "홍길동";
	}
	
}
