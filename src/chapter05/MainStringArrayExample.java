package chapter05;

public class MainStringArrayExample {
	public static void main(String[] args) { // args = {};
		if (args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			return;
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
