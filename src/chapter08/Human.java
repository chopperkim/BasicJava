package chapter08;

public class Human implements Comparable<Human> {
	private String name;
	private int age;
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Human o) {
		// 양수를 반환하면 자리가 바뀌고, 음수를 반환하면 자리가 바뀌지 않고
		// 0을 반환하면 같은 데이터라고 판단해서 정렬해준다. 
//		if (this.age > o.age) {
//			return -1;
//		} else if (this.age < o.age) {
//			return 1;
//		} else {
//			return 0;
//		}
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return String.format("(name=%s, age=%s)", name, age);
	}
	
}
