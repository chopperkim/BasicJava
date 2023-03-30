package chapter04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		/*
		 * 컴퓨터가 1부터 100 사이의 임의의 정수를 생성하면,
		 * 그 수를 맞추는 게임을 만들어보자.
		 * 사용자가 추측한 수를 입력하면,
		 * 컴퓨터가 생성한 수보다 큰지 작은지를 알려준다.
		 * 사용자가 추측한 수가 컴퓨터가 생성한 수와 같을 때까지 반복한다.
		 */
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int ranNum = random.nextInt(100) + 1;
		boolean flag = true;
		int count = 0;
		while (flag) {
			count++;
			System.out.print("1부터 100사이의 정수중 하나를 입력하세요: ");
			int inputNum = scanner.nextInt();
			if (ranNum > inputNum) {
				System.out.println("정답은 더 큰 수 입니다.");
			} else if (ranNum < inputNum) {
				System.out.println("정답은 더 작은 수 입니다.");
			} else {
				System.out.println("정답입니다.");
				flag = false;
			} 
		}
		System.out.println("총 " + count + "번 만에 맞추셨습니다.");
		System.out.println("게임을 종료합니다.");
		scanner.close();
	}
}
