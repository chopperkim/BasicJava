package chapter05;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		String[] arr3 = new String[4];
		arr3[0] = "1월";
		arr3[1] = "2월";
		for (int i = 0; i < arr3.length; i++) {// 0 1 2 3 4(x)
			System.out.println(arr3[i]);
		}
		for (String string : arr3) {
			System.out.println(string);
		}
	}
}



