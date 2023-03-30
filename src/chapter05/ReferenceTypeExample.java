package chapter05;

import java.util.Random;
import java.util.Scanner;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		String str = null;
		str = str + 1;
		System.out.println(str);
		Random random1 = new Random(); // random1 = 19;
		Random random2 = new Random(); // random2 = 20;
		if (random1 == random2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
		String str1 = "홍길동"; // str1 = 22;
		String str2 = "홍길동"; // str2 = 22;
		if (str1 == str2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
		
	}
}
