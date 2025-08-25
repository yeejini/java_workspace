package ch11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// Set자체는 인터페이스이므로 new로 객체만드는 순간 구현체가 생김 , 따라서 HashSet으로 upcasting을 통해 구현
		Set<String> set = Set.of("포도", "수박", "사과", "키위", "망고");
		Set<String> fruits = new HashSet<String>(set);

		fruits.add(null);

		System.out.println(fruits); // [null, 포도, 망고, 수박, 사과, 키위]
		// 내가 넣은 순서가 아닌 시스템 내부의 순서로 출력

		fruits.remove("키위");
		System.out.println(fruits);

		TreeSet<String> fruits2 = new TreeSet<String>(set);

		System.out.println(fruits2.lower("망고"));

	}

}
