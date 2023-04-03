package chapter07.exercise.bank;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount account;
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return String.format("%s %s, 잔액: %,d원",firstName, lastName, account.getBalance());
	}
}
