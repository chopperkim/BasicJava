package chapter13;

import java.util.ArrayList;
import java.util.HashMap;

import chapter11.Student;

public class GenericExample {
	public static void main(String[] args) {
		int[] nums = new int[30];
		// JDK 1.7부터 타입 추론
		ArrayList<Student> arrayList = new ArrayList<>();
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동"); // 0번째
		list.add("신용권"); // 1번째
		list.add("자바");	// 2번째
//		list.add(30);		// 3번째
		if (list.get(3) instanceof String) {
			String name1 = (String) list.get(3);
			System.out.println(name1);
		}
		
		HashMap<String, Integer> hashMap = new HashMap<>();
	}
}
