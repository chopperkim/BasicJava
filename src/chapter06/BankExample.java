package chapter06;

public class BankExample {
	public static void main(String[] args) {
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount();
		a.balance = 100;
		b.balance -= 50;
		System.out.println("a: " + a.balance);
		System.out.println("b: " + b.balance);
	}
}
