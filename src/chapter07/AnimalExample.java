package chapter07;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		dog.breath();
		cat.sound();
//		new Animal();
		
//		Animal a = new Animal(); // (X) 현실 세계에서는 일어날 수 없는 코드
//		a.sound();
	}
}
