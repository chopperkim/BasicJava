package chapter10;

import java.util.Scanner;

public class FinallyExample {
	public static void main(String[] args) {
//		Scanner scanner = null;
//		try {
//			scanner = new Scanner(System.in);
//			int num1 = scanner.nextInt();
//			int num2 = scanner.nextInt(); // 만약 여기서 에러가 발생하면
//			int result = num1 + num2;
//			System.out.println("결과: " + result);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return;
//		} finally {
//			if (scanner != null) {
//				scanner.close();
//			}
//		}
		// try catch with resource (jdk 1.7부터 사용 가능)
		try (Scanner scanner = new Scanner(System.in)) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt(); // 만약 여기서 에러가 발생하면
			int result = num1 + num2;
			System.out.println("결과: " + result);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
}






