package chapter07;

public class Car {
	private Tire frontLeftTire = new HankookTire("앞 왼쪽", 6);
	private Tire frontRightTire = new HankookTire("앞 오른쪽", 2);
	private Tire rearLeftTire = new NexenTire("뒤 왼쪽", 3);
	private Tire rearRightTire = new NexenTire("뒤 오른쪽", 4);
	
	public int run() throws Exception {
		System.out.println("[자동차가 달립니다.]\n");
		Thread.sleep(3000);
		if (!frontLeftTire.roll()) {
			stop();
			return 1;
		}
		if (!frontRightTire.roll()) {
			stop();
			return 2;
		}
		if (!rearLeftTire.roll()) {
			stop();
			return 3;
		}
		if (!rearRightTire.roll()) {
			stop();
			return 4;
		}
		return 0;
	}
	public void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	public void setFrontLeftTire(Tire frontLeftTire) {
		this.frontLeftTire = frontLeftTire;
	}
	public void setFrontRightTire(Tire frontRightTire) {
		this.frontRightTire = frontRightTire;
	}
	public void setRearLeftTire(Tire rearLeftTire) {
		this.rearLeftTire = rearLeftTire;
	}
	public void setRearRightTire(Tire rearRightTire) {
		this.rearRightTire = rearRightTire;
	}
	
}
