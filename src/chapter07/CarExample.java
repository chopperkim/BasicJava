package chapter07;

public class CarExample {
	public static void main(String[] args) throws Exception {
		Car car = new Car();
		for (int i = 0; ; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.setFrontLeftTire(new HankookTire("앞 왼쪽", 15));
				break;
			case 2:
				System.out.println("앞 오른쪽 NexenTire로 교체");
				car.setFrontRightTire(new NexenTire("앞 오른쪽", 13));
				break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTire로 교체");
				car.setRearLeftTire(new HankookTire("뒤 왼쪽", 14));
				break;
			case 4:
				System.out.println("뒤 오른쪽 NexenTire로 교체");
				car.setRearRightTire(new NexenTire("뒤 오른쪽", 17));
				break;
			}
			System.out.println("---------------------------");
		}
	}
}
