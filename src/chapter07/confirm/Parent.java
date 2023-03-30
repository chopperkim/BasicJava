package chapter07.confirm;

public class Parent {
	public Parent() {
		this("대한민국");
		System.out.println("Parent call");
	}
	public Parent(String nation) {
		super();
		System.out.println("Parent nation call");
	}
}
