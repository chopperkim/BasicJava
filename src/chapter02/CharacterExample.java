package chapter02;

public class CharacterExample {
	public static void main(String[] args) {
		
		for (char c = Character.MIN_VALUE; c < Character.MAX_VALUE; c++) {
			System.out.printf("%04x\t", (int) c);
			System.out.printf("%s\t", c);
			if (c % 5 == 0) {
				System.out.println();
			}
		}
	}
}
