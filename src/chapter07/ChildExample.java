package chapter07;

public class ChildExample {
	public static void main(String[] args) {
		method(new Parent());
	}
	public static void method(Parent parent) { // Parent parent = new Child();
		if (parent instanceof Child) {
			Child child = (Child) parent;
			child.study();
		} else {
			System.out.println("강제로 타입을 변환할 수 없습니다.");
		}
	}
}
