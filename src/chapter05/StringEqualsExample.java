package chapter05;

import java.util.List;

public class StringEqualsExample {
	public static void main(String[] args) {
		// String은 참조타입
		// jdk 1.5부터 String Pool이라는 공간을 만들었음(Heap) 
		int a = 10;
		// Josh Bloch => 죠수아 블록
		String str = new String("홍길동");// 0x1234
		String str2 = "홍길동"; // 리터럴로 문자열을 저장할 때 // 0x1235 
		String str3 = "홍길동"; // 0x1235
		String str4 = "홍길동";
	}
}
