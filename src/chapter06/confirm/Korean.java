package chapter06.confirm;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;// 주민등록번호
	int age;
	// 망원경 telescoping constructor pattern
	// java bean pattern, builder pattern
	// constructor: 객체가 생성될 때 호출
	public Korean() {
		this(null, null, 0);
	}
	public Korean(String name) {
		this(name, null, 0);
	}
	public Korean(String name, String ssn) {
		this(name, ssn, 0);
	}
	public Korean(String name, String ssn, int age) {
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		System.out.println("한국사람이 탄생하셨습니다.");
	}
}
