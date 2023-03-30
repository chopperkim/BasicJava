package chapter03.confirm;

import java.util.Scanner;

public class Confirm311 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int password = 12345;
		if ("java".equals(name)) {
			if (password == 12345) {
				System.out.println("비밀번호 일치");
			}
			System.out.println("아이디 일치");
		} else {
			System.out.println("아이디 일치하지 않음");
		}
	}
}
