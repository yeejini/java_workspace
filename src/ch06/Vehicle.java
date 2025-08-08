package ch06;

public class Vehicle {
	String name = "탈 것";

	void whoamI() {
		System.out.println("나는 탈 것이다.");
	}

	// static은 오버라이딩 대상 아님
	static void move() {
		System.out.println("이동하다.");
	}
}

class Car1 extends Vehicle {
	String name = "자동차";

	@Override
	void whoamI() {
		System.out.println("나는 자동차이다.");
	}

	static void move() {
		System.out.println("달린다.");
	}

}

class SportCar extends Vehicle {
	String name = "스포츠카";

	@Override
	void whoamI() {
		System.out.println("나는 스포츠 자동차이다.");
	}

	static void move() {
		System.out.println("세게 달린다.");
	}

}
