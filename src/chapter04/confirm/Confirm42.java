package chapter04.confirm;

public class Confirm42 {
	public static void main(String[] args) {
		/*
		 * 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하시오.
		 */
		int sum = 0; 
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
