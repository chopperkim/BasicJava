package chapter05.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = {
				34, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
				31, 32, 33, 1, 35, 36, 37, 38, 39, 40,
				41, 42, 43, 44, 45
		};
		// numbers[0]와 numbers[ranNum]의 숫자를 맞바꿔준다.
		for (int i = 0; i < numbers.length; i++) {
			int ranNum = random.nextInt(45);
			int temp = numbers[i];
			numbers[i] = numbers[ranNum];
			numbers[ranNum] = temp;
		}
		for (int i = 0; i < 6; i++) {
//			if (i != 0) {
//				System.out.print(", ");
//			}
			System.out.print((i == 0 ? "" : ", ") + numbers[i]);
		}

//		int[] lotto = new int[6];
//		for (int i = 0; i < 6; i++) {
////			System.out.print(numbers[i] + ", ");
//			lotto[i] = numbers[i];
//		}
//		System.out.println(Arrays.toString(lotto));
	}
}
