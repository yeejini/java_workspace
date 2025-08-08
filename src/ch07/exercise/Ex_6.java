package ch07.exercise;

public class Ex_6 {

	public static void main(String[] args) {

	}

}

interface Human {
	void eat();

	default void print() {
		System.out.println("출력");
	}

	static void echo() {
		System.out.println("야호");
	}
}

class Worker implements Human {

	@Override
	public void eat() {
		System.out.println("빵을 먹습니다.");
	}

}

class Student implements Human {
	int age;

	public Student(int age) {
		this.age = age;
	}

	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}

	@Override
	public void print() {
		System.out.println(age + "세 학생입니다.");
	}

}