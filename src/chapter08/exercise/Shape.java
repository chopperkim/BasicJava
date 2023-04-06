package chapter08.exercise;

public abstract class Shape implements Comparable<Shape> {
	private String name = "삼각형";
	
	public Shape() {
	}
	public abstract double area();
	public abstract double perimeter();
	
	@Override
	public int compareTo(Shape o) {
		if (area() > o.area()) {
			return 2;
		} else if (area() < o.area()) {
			return -2;
		} else {
			return 0;
		}
	}
	public abstract String getName();
	@Override
	public String toString() {
		return "도형의 종류: " + getName() + ", 둘레: " + perimeter() + "㎝, 넓이: " + area() + "㎠";
	}
}
