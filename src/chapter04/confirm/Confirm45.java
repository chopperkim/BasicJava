package chapter04.confirm;

public class Confirm45 {
	public static void main(String[] args) {
		/*
		 * for문을 이용해서 다음과 같이 *을 출력하는 코드를 작성하시오.
		 * *
		 * **
		 * ***
		 * ****
		 */
		// 세로방향 반복(row)
		for (int i = 1; i <= 4; i++) {
			// 가로방향 반복(column)
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}




