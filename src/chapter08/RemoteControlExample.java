package chapter08;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc = new Audio();
		rc.turnOn();
		
		RemoteControl r = new SmartTelevision();
		r.turnOn();
		Searchable s = (Searchable) r;
		s.search("Java");
		
	}
}
