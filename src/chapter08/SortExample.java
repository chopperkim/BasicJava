package chapter08;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] numbers = { 4, 29, 10, 83, 29, 44, 78, 61, 3, 52, 17, 99, 100, 12, 33 };
		System.out.println(Arrays.toString(bubbleSort(numbers, numbers.length)));
		String[] names = {"홍길동", "신용권", "이순신", "류관순"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	}

	static int[] bubbleSort(int arr[], int len) {
		int i, j, tmp;
		for (i = 0; i < len - 1; ++i) {
			for (j = 0; j < len - i - 1; ++j) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		return arr;
	}
}
