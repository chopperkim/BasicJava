package chapter06;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		s1.setName("홍길동");
		Singleton s2 = Singleton.getInstance();
		s2.setAge(35);
		Singleton s3 = Singleton.getInstance();
		System.out.println(s3.getName());
		System.out.println(s3.getAge());
		
	}
}
