package ch07;

public class AnimalDemo {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cuckoo c = new Cuckoo();

		makeSound(d);
		makeSound(c);
	}

	// 다형성에 의해 객체가 바뀌면 동작이 달라짐
	private static void makeSound(Animal a) {
		a.sound();
	}

}

interface Animal {
	void sound();
}

class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}

class Cuckoo implements Animal {

	@Override
	public void sound() {
		System.out.println("뻐꾹");
	}

}