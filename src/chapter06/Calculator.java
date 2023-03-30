package chapter06;

public class Calculator {
	static double pi = 3.14159;
	
	public Calculator() {
		pi = 3.14;
		plus(10, 20);
	}
	
	int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
}
