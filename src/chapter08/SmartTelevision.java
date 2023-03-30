package chapter08;

public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		System.out.println(url);
	}

	@Override
	public void turnOn() {
		System.out.println("SmartTelevision 켜집니다.");
	}

}
