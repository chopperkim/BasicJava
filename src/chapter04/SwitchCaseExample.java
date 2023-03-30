package chapter04;

import java.util.Random;

public class SwitchCaseExample {
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(6) + 1;
		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("6번이 나왔습니다.");
			break;
		default:
			System.out.println("주사위 숫자가 나오지 않았습니다.");
			break;
		}
	}
}




