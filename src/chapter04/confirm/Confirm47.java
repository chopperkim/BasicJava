package chapter04.confirm;

import java.util.Scanner;

public class Confirm47 {
	public static void main(String[] args) {
		/*
		 * while문과 Scanner를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료
		 * 기능을 제공하는 코드를 작성하세요.
		 */
		boolean run = true; // 반복문 실행 여부
		int balance = 0; // 계좌 잔액
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			int menu = Integer.parseInt(scanner.nextLine());
			if (menu == 1) {
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
			} else if (menu == 2) {
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
			} else if (menu == 3) {
				System.out.println("잔고> " + balance);
			} else if (menu == 4) {
				run = false;
			} else {
				System.out.println("선택하신 메뉴가 없습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
}
