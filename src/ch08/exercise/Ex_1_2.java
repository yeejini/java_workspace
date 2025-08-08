package ch08.exercise;

public class Ex_1_2 {

	public static void main(String[] args) {
		Person p1 = new Person("111111", "홍길동");
		Person p2 = new Person("111111", "홍길동");
		Person p3 = new Person("123456", "손흥민");

		if (p1.equals(p2)) {
			System.out.println("같은 사람이다.");
		} else {
			System.out.println("다른 사람이다.");
		}

		if (p2.equals(p3)) {
			System.out.println("같은 사람이다.");

		} else {
			System.out.println("다른 사람이다.");
		}
	}

}

class Person {
	String number;
	String name;

	Person(String number, String name) {
		this.number = number;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person p) {
			if (number.equals(p.number) && name.equals(p.name)) {
				return true;
			}
		}
		return false;
	}
}