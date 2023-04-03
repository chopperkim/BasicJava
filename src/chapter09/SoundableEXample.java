package chapter09;

public class SoundableEXample {
	public static void main(String[] args) {
		Soundable s = new Soundable() {
			@Override
			public String sound() {
				return "어흥";
			}
		};
		System.out.println(s.sound());
		
	}
}
