package ch11;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<Fruits, Integer> fruits = new HashMap<>();

		fruits.put(new Fruits("사과"), 3);
		fruits.put(new Fruits("사과"), 5);
		fruits.put(new Fruits("바나나"), 5);
		fruits.put(new Fruits("딸기"), 10);

		System.out.println(fruits.size()); // equals가 없기에 중복 체크 못함

		System.out.println(fruits.keySet());
		System.out.println(fruits.values());

		System.out.println(fruits.containsKey("사과"));

		// BiConsumer
		fruits.forEach((x, y) -> System.out.println(x + ":" + y));
//		fruits.forEach(System:println));

	}

}

class Fruits {
	String name;

	public Fruits(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	// HashMap의 K,V의 중복체크를 위해서는 equals와 HashCode를 꼭 오버라이드를 해야한다.
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj instanceof Fruits f) {
			return this.hashCode() == f.hashCode();
//			return this.name.equals(f.name); //이름으로만 비교해도 항상 hashCod를 오버라이드 해야 함.
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}