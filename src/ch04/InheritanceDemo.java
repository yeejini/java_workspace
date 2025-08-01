package ch04;

public class InheritanceDemo {

	public static void main(String[] args) {
		Animals animal = new Animals();
		animal.eat();

		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.move();

		Bird bird = new Bird();
		bird.eat();
//		bird.fly();
		bird.move();

		Fish fish = new Fish();
		fish.move();

	}

}

class Animals {
	// 주둥이를 가진다.
	String mouth;

	// 먹는다,
	void eat() {
		System.out.println("먹습니다.");
	}

	// 움직인다
	void move() {
		System.out.println("움직인다.");
	}
}

class Tiger extends Animals {
	// 주둥이
	// 먹고
	// 움직인다
	@Override
	void move() {
		System.out.println("뛴다.");
	}
	// 뛴다
//	void run() {
//		System.out.println("뛴다.");
//	}
}

class Fish extends Animals {
	// 주둥이
	// 먹고
	// 움직인다
	@Override
	void move() {
		System.out.println("헤엄치다.");
	}
	// 헤엄치다
//	void swim() {
//		System.out.println("헤엄치다.");
//	}
}

class Bird extends Animals {
	// 주둥이
	// 먹고
	// 움직인다 move
	@Override
	void move() {
		System.out.println("날다.");
	}
	// 날다
//	void fly() {
//		System.out.println("날다.");
//	}

}