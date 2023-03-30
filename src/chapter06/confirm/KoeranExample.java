package chapter06.confirm;

public class KoeranExample {
	public static void main(String[] args) {
		new Korean();
		new Korean("");
		new Korean("", "", 0);
		Korean k1 = new Korean("이소연", "1234");
		Korean k2 = new Korean("신진수", "2345");
		Korean k3 = new Korean("서예린", "3456");
		Korean k4 = new Korean("김채현", "4567");
	}
}
