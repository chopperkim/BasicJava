package chapter08;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV가 켜집니다.");
	}

}
