package chapter05.exercise;

public class Exercise51 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;// 가장 작은 값으로 시작
		int min = Integer.MAX_VALUE;// 가장 큰 값으로 시작
		int[] arr = {38, 94, 16, 3, 76, -544, 94, 82, 47, 59, 8, 120251};
//		int max = arr[0];
//		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
