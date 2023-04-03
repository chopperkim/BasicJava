package chapter10;

public class ThrowExample {
	public static void main(String[] args) {
		// throws => 메소드를 호출한 곳으로 예외를 던진다
		// findClass() throws Exception => method가 Exception예외를 던진다.
		try {
			findClass();
			// throw => 예외를 개발자가 만든다.
			// I throw new Exception(); => 개발자가 예외를 만들어서 던진다.
			throw new Exception();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("사용중 에러가 발생했습니다. 관리자에게 문의하세요.");
		} 
	}
	private static void findClass() throws Exception {
		Class.forName("");
	}
}
