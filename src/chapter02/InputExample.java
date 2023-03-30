package chapter02;

import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		// Scanner라는 클래스를 이용해서 데이터 입력 String
		Scanner scanner = new Scanner(System.in);
		
//		String str = scanner.nextLine();// 문자열 입력 next()
//		int intValue = scanner.nextInt(); // 정수(integer) 입력
		int intValue = Integer.parseInt(scanner.nextLine());
//		double doubleValue = scanner.nextDouble();// 실수(double) 입력
//		System.out.println(str + " = "+ (intValue + doubleValue));
//		System.out.println(intValue);
	}
}
