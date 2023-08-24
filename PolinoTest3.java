class Base {
	int x=1;

	void method() {
		System.out.println("Base method");
	}
}

class Derived extends Base {
	int x=2;
	int y=3;

	void method() { // overrideng
		System.out.println("Derived method");
	}
}

public class PolinoTest3 {
	public static void main(String[] args) {
		Base base1 = new Derived(); // upcasting
		base1.method(); // 다형성
		base1.x = 10;
		// base1.y = 20;

		Base base2 = new Base();
		base2.method();

		if (base1 instanceof Derived) {  //true
			Derived derived1 = (Derived) base1; // downcasting
			derived1.y = 20;
		}

		if (base2 instanceof Derived) { //false
			Derived derived2 = (Derived) base2;
			derived2.y = 30;
		}
		
		Base base3 = new Derived();
		base3.method(); //Derived method 호출
		System.out.println(base3.x);  //Base의 x 값 출력 
	}
}
