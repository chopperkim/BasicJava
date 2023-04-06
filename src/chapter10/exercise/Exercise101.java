package chapter10.exercise;

import java.util.Scanner;

public class Exercise101 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("어떤 수를 나누시겠습니까?>> ");
				int dividend = Integer.parseInt(scanner.nextLine());
				System.out.print("어떤 수로 나누시겠습니까?>> ");
				int divisor = Integer.parseInt(scanner.nextLine());
				int quotient = dividend / divisor;
				System.out.printf("%d / %d = %d", dividend, divisor, quotient);
				break;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}
		}
		scanner.close();
	}
}
