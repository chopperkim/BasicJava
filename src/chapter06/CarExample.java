package chapter06;

public class CarExample {
	public static void main(String[] args) {
//		int a;
//		a = a + 10;
//		System.out.println(a);
		Car car = new Car();
		car.speed = car.speed + 10;
		System.out.println(car.speed);
	}
}
