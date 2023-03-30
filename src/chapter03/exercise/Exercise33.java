package chapter03.exercise;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연도를 입력: ");
		int year = scanner.nextInt();
		String result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "맞습니다." : "아닙니다.";
		System.out.println(year + "년은 윤년이 " + result);
		scanner.close();
	}
}
