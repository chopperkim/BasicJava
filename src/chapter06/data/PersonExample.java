package chapter06.data;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
//		p1.setName("홍길동");
//		p1.setAge(20);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		Person p2 = new Person("신용권", 25);
//		p2.setName("신용권");
//		p2.setAge(25);
	}
}
