package chapter11;

public class HashExample {
	public static void main(String[] args) {
		String str = "Hello Java! Hi Bye";
//		if (str.indexOf("j") != -1) { // str.contains("j");
//			System.out.println("j가 있다.");
//		}
		String[] split = str.split("!");
		for (String string : split) {
			System.out.println(string);
		}
		
		String string = str.replace("J", "j");
		System.out.println(str);
		System.out.println(string);
//		Member member = new Member();
//		Class mc = member.getClass();
//		System.out.println(mc.getSimpleName());
//		Field[] fields = mc.getDeclaredFields();
//		for (Field field : fields) {
//			System.out.println(field.getName());
//		}
		
		
	}
}
