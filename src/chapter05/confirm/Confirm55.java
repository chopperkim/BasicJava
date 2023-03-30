package chapter05.confirm;

public class Confirm55 {
	public static void main(String[] args) {
		int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88},
		};
		int sum = 0;
		double avg = 0;
		int count = 0;
		for (int[] is : array) {
			for (int i : is) {
				sum += i;
				count++;
			}
		}
		avg = (double) sum / count;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
