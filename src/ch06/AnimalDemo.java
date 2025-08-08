package ch06;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal a = new Animal();

		Eagle e = new Eagle();
		e.move();

		Tiger t = new Tiger();
		t.move();

		Goldfish g = new Goldfish();
		g.move();
	}

}

class Animal {
	String eye;
	String mouth;

	void eat() {

	}

	void sleep() {

	}

	void move() {
		System.out.println("동물은 움직인다.");
	}
}

class Eagle extends Animal {
	String wing;

//	void fly() {
//
//	}
	@Override
	void move() {
		System.out.println("독수리는 날아갑니다.");
	}
}

class Tiger extends Animal {
	String leg;

//	void run() {
//
//	}
	@Override
	void move() {
		System.out.println("호랑이는 달립니다.");
	}
}

class Goldfish extends Animal {
	String fin;

//	void swim() {
//
//	}
	@Override
	void move() {
		System.out.println("금붕어는 헤엄칩니다.");
	}
}