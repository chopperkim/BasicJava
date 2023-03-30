package chapter04;

import java.util.Random;

public class IfDiceExample {
	public static void main(String[] args) {
//		Math.random(); // 0부터 1미만의 실수
		// SecureRandom
		Random random = new Random();
		int num = random.nextInt(6) + 1;
		
	}
}
