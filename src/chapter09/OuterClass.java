package chapter09;

public class OuterClass {
	String outerName;
	static int age;
	
	void outerMethod() {
		System.out.println("OuterClass의 outerMethod() 호출");
		class LocalClass {
			String localName;
			void localMethod() {
				System.out.println("LocalClass의 localMethod() 호출");
			}
		}
		LocalClass localClass = new LocalClass();
		localClass.localMethod();
	}
	class InnerClass {
		String innerName;
		public InnerClass() {
		}
		void innerMethod() {
			System.out.println("InnerClass의 innerMethod() 호출");
		}
	}
	static class StaticInnerClass {
		String staticInnerName;
		void staticInnerMethod() {
			System.out.println("StaticInnerClass의 staticInnerMethod() 호출");
		}
	}
}







