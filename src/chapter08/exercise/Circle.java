package chapter08.exercise;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	@Override
	public double perimeter() {
		return 2.0 * Math.PI * radius;
	}
//	@Override
//	public String toString() {
//		return "도형의 종류: 원, 둘레: " + perimeter() + "㎝, 넓이: " + area() + "㎠";
//		return String.format("도형의 종류: 원, 둘레: %.15f㎝, 넓이: %.15f㎠", perimeter(), area());
//	}
	@Override
	public String getName() {
		return "원";
	}
}
