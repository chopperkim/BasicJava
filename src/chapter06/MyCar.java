package chapter06;

public class MyCar {
	int gas;
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		setGas(10);
		if (gas == 0) {
			System.out.println("가스가 없습니다.");
			return false;
		}
		System.out.println("가스가 있습니다.");
		return true;
	}

}
