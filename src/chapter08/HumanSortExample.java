package chapter08;

import java.util.Arrays;

public class HumanSortExample {
	public static void main(String[] args) {
		int[] numbers = { 4, 29, 10, 83, 29, 44, 78, 61, 3, 52, 17, 99, 100, 12, 33 };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println();
		Human[] hm = {
				new Human("김수지", 10), new Human("임석일", 20), new Human("강서주", 25),
				new Human("이미지", 36), new Human("곽우재", 65), new Human("김승종", 13),
				new Human("조수인", 56), new Human("임민우", 43), new Human("최서연", 9),
				new Human("윤하늘", 62), new Human("이현학", 52), new Human("이경민", 43),
		};
		Arrays.sort(hm);
		System.out.println(Arrays.toString(hm));
	}
}
