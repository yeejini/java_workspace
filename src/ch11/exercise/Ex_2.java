package ch11.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Ex_2 {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();

		set.add(new Person("김열공", 20));
		set.add(new Person("최고봉", 56));
		set.add(new Person("우등생", 16));
		set.add(new Person("나자바", 35));
		set.add(new Person("나자바", 35));

		// hashSet에 저장된 요소를 하나씩 꺼내서 출력하는 반복문
		// for-each 문으로도 가능하지만, Iterator를 쓰면 반복 중 요소 삭제 같은 제어가 가능
		Iterator<Person> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
	}

}

//Comparable -> compareTo구현되어야 비교 가능

//중복인지 아닌지 -> hashCode, equals,가 구현되어야함
class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Person [%s : %d]", name, age);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj instanceof Person p) {
			return this.hashCode() == obj.hashCode();
		}
		return false;

	}

}