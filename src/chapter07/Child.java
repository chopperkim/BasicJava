package chapter07;

public class Child extends Parent {
	private String name;
	
	public Child() {
	}

	@Override
	void run() {
		System.out.println("자식 객체의 run");
	}
//	@Override
//	public void method1() {
//		System.out.println("Child method1");
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	void study() {
		System.out.println("공부를 하고 있습니다.");
	}
}
