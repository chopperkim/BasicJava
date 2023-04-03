package chapter09;

public class AnonymousExample {
	public static void main(String[] args) {
		// 실명
//		MyImplement myImplement = new MyImplement();
//		myImplement.run();
		
		// Anonymous 익명
		MyInterface interface1 = new MyInterface() {
			@Override
			public void run(String message) {
				System.out.println(message + ": 익명 클래스를 통해 메소드 실행됨");
			}
		};
		interface1.run("안녕하세요");
	}
}




