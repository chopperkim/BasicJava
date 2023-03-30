package chapter06;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("1234", "홍길동");
		Person p2 = new Person("2345", "홍삼원");
		System.out.println(p1.ssn);
		System.out.println(p2.ssn);
	}
}
