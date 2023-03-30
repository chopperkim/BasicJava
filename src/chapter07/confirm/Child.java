package chapter07.confirm;

public class Child extends Parent {
	public Child() {
		super();
//		this("홍길동");
		System.out.println("Child call");
	}
	public Child(String name) {
		super();
		System.out.println("Child name call");
	}
}
