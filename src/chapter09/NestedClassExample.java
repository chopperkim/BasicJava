package chapter09;

import chapter09.OuterClass.InnerClass;
import chapter09.OuterClass.StaticInnerClass;

public class NestedClassExample {
	public static void main(String[] args) {
		OuterClass class1 = new OuterClass();
		class1.outerMethod();
		InnerClass class2 = new OuterClass(). new InnerClass();
		class2.innerMethod();
		
		OuterClass.age = 10;
		StaticInnerClass class3 = new StaticInnerClass();
		class3.staticInnerName = "";
		class3.staticInnerMethod();
	}
}
