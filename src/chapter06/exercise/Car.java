package chapter06.exercise;

public class Car extends Object {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;
	public Car() {
	}
	public Car(String color) {
		super();
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	public boolean speedUp(double speed) {
		if (this.speed + speed > 0 && this.speed + speed <= MAX_SPEED) {
			this.speed += speed;
			return true;
		}
		return false;
	}
	
}
