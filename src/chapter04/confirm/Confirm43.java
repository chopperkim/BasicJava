package chapter04.confirm;

import java.util.Random;

public class Confirm43 {
	public static void main(String[] args) {
		/*
		 * while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을
		 * (눈1, 눈2)로 출력하고, 합이 5가되면 실행을 멈추는 프로그램
		 */
		Random random = new Random();
		while (true) {
			// 주사위를 던지는 부분
			int first = random.nextInt(6) + 1;
			int second = random.nextInt(6) + 1;
			// 출력하는 부분
			System.out.printf("(%d, %d)\n", first, second);
			if (first + second == 5) {
				break;
			}
		}
	}
}
