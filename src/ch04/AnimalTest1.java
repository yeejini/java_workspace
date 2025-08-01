package ch04;

public class AnimalTest1 {

	public static void main(String[] args) {
		Animal animal = new Animal();

	}

}

class Animal {
	int age;
	String gender;

	void isMammal() {

	}

	void introduce(String name) {

	}
}

class Duck extends Animal {
	String beakColor = "yellow";

	void swim() {

	}

	void quak() {

	}
}

class Fish2 extends Animal {
	int sizeInft;

	void swim() {

	}
}
