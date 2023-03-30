package chapter04.exercise;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		/*
		 * 두 사람이 하는 가위 바위 보 게임을 만들어 보자.
		 * 두 사람이 입력한 문자열을 비교하여 누가 이겼는지
		 * 출력하는 프로그램이다.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		System.out.print("철수: ");
		String cheolsu = scanner.nextLine();
		System.out.print("영희: ");
		String yeonghui = scanner.nextLine();
		String result = "";
		if (cheolsu.equals(yeonghui)) {
			result = "비김!";
		} else if (cheolsu.equals("가위") && yeonghui.equals("바위")
				|| cheolsu.equals("바위") && yeonghui.equals("보")
				|| cheolsu.equals("보") && yeonghui.equals("가위")) {
			result = "영희 승리!";
		} else {
			result = "철수 승리!";
		}
		System.out.println("결과: " + result);
		scanner.close();
	}
}






