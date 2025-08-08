package ch07.exercise;

import java.util.Arrays;

public class Ex_3_4 {

	public static void main(String[] args) {
		Person[] persons = { new Person("손흥민", 20, 180, 70), new Person("박지성", 40, 175, 68), new Person("홀길동", 32, 170, 75) };

//		int result = persons[0].compareTo(persons[1]);
//		System.out.println(result);
		System.out.println("정렬 전");
		for (Person person : persons) {
			System.out.println(person);
		}

		Arrays.sort(persons);

		System.out.println("정렬 후");
		for (Person person : persons) {
			System.out.println(person);
		}

	}

}

class Person implements Comparable {
	int age, height, width;
	String name;

	Person(String name, int age, int height, int width) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.width = width;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Person p) {
			return p.age - this.age;
		}
		return 0;
	}

	@Override
	public String toString() {
		return String.format("Person [이름= %s, 나이= %d, 키= %d, 몸무게= %d]", name, age, height, width);
	}

}