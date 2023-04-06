package chapter11;

import java.util.Objects;

public class Member {
	private String name;
	public int age;

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && Objects.equals(age, other.age);
	}
	
}
