package chapter07;

public class Parent {
	private String name;
	
	public Parent() {
	}
	void run() {
		System.out.println("부모 객체의 run");
	}
	final public void method1() {
		System.out.println("Parent method1");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
