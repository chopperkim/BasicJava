package chapter07;

// 타이어 규격(스펙)
public abstract class Tire {
	String location;
	int maxRotation;
	int accumulatedRotation;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public abstract boolean roll();
}
