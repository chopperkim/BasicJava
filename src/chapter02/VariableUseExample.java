package chapter02;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 45;
//		System.out.println(hour + "시간 " + minute + "분");
		System.out.printf("%02d시간 %02d분\n", hour, minute);
		int totalMinute = (hour * 60) + minute;
		System.out.println("총 " + totalMinute + "분");
		System.out.printf("%.4f\t%,d", 3.1423923123123123, 102456456456034L);
	}
}
