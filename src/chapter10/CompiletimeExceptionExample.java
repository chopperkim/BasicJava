package chapter10;

public class CompiletimeExceptionExample {
	public static void main(String[] args) {
		// 1. try catch (finally) => 예외를 직접 처리하는 방식
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 2. throws 예외 => 예외를 직접 처리하지 않고 떠넘기는 방식
	}

	private static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
