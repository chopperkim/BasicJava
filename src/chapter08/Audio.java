package chapter08;

public class Audio implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("Audio가 켜집니다.");
	}

}
