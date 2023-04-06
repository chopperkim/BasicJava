package chapter10.exercise;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	private int numberOfAccounts;
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts++] = account;
	}
	public BankAccount getAccount(int index) {
		return accounts[index];
	}
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	@Override
	public String toString() {
		return String.format("%s %s, 계좌의 갯수: %,d",firstName, lastName, numberOfAccounts);
	}
}
