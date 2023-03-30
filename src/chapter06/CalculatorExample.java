package chapter06;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println("15 + 30 = " + calculator.plus(15, 30));
		
		// 반지름이 5인 원의 넓이를 구한다.
		double result = 5 * 5 * Calculator.pi;
		System.out.println("반지름이 5인 원의 넓이: " + result);
		// 뺄셈 연산을 한다. 100 - 24
		System.out.println(Calculator.minus(100, 24));
	}
}
