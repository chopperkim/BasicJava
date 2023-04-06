package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		String[] subjects = {"Java", "Database", "Servlet/JSP", "JDBC", "iBatis"};
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Servlet/JSP");
		list.add("JDBC");
		list.add(2, "Database");
		list.add("iBatis");
		for (int i = 0; i < list.size(); i++) {
			String subtitle = list.get(i);
			System.out.println(subtitle);
		}
		
		System.out.println("갯수: " + list.size());
		System.out.println("2번째 과목: " + list.get(2));
		
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");
		for (String string : list) {
			System.out.println(string);
		}
	}
}


