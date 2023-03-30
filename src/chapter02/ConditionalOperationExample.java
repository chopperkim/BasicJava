package chapter02;

import java.util.Scanner;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int score = Integer.parseInt(scanner.nextLine()); // scanner.nextInt()
		char grade = score > 90 ? 'A' : (score > 80 ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}
