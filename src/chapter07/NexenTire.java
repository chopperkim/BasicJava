package chapter07;

public class NexenTire extends Tire {

	public NexenTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " NexenTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}
		System.out.println("*** " + location + " NexenTire 펑크 ***");
		return false;
	}

}
