package chapter11;

import java.security.SecureRandom;
import java.util.Random;

public class WrapperExample {
	public static void main(String[] args) {
		String str = "";
		
		int a = 10;
		Integer b = new Integer(10);
		int c = new Integer(10); // auto unboxing 자동 언박싱
		Integer d = 10; // new Integer(10) => auto boxing 자동 박싱
		
		long startSum1 = System.nanoTime();
		Integer sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		long endSum1 = System.nanoTime();
		System.out.println("1부터 100까지의 합: " + sum);
		System.out.println("걸린 시간: " + (endSum1 - startSum1));
		
		long startSum2 = System.nanoTime();
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			sum2 += i;
		}
		long endSum2 = System.nanoTime();
		System.out.println("1부터 100까지의 합: " + sum2);
		System.out.println("걸린 시간: " + (endSum2 - startSum2));
		Integer obj1 = 127; // new Integer(127);
		Integer obj2 = 127; // new Integer(127);
		System.out.println(obj1 == obj2);
		
		Random random = new Random();
		int num = random.nextInt(10) + 1;
	}
}









