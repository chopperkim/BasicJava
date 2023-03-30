package chapter08;

public class MyClass {
	RemoteControl rc = new Television();
	
	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
	}
	void methodB() {
		RemoteControl rc = new Television();
		rc.turnOn();
	}
	void methodA(RemoteControl rc) {
		rc.turnOn();
	}
}
