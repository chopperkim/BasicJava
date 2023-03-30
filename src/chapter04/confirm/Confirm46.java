package chapter04.confirm;

public class Confirm46 {
	public static void main(String[] args) {
		/*
		 * for문을 이용해서 다음과 같이 *을 출력하는 코드를 작성해보세요.
		 *     *
		 *    **
		 *   ***
		 *  ****
		 *  
		 *  ***
		 *  **
		 *  *
		 *  
		 */
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 4; j >= 1; j--) {
//				if (j > i) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		String str = "";
		for (int i = 0; i < 4; i++) {
			str += "*";
			System.out.printf("%4s\n", str);
		}
	}
}
