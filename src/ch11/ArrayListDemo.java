package ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = List.of("그랜저", "소나타", "제니시스", "소울");

		// ArrayList는 추가가능 동적
		List<String> car1 = new ArrayList<>(list);
//		car1.add("싼타페");

		car1.add("모닝");
		car1.add(0, "싼타페");

		System.out.println(car1); // ArrayList의 부모 class에서 toString이 구현이 되어있기에 주소값이 아닌 값이 반환됨
		System.out.println(car1.contains("테슬라"));

		List<String> car2 = new ArrayList<>(list);
		car1.add("제네시스");
		System.out.println(car2);

		System.out.println(car1.containsAll(car2));

		// "소"로 시작하는 것 만 지워라
		car1.removeIf(c -> c.startsWith("소"));
		System.out.println(car1);

		// car가 전달되면, new를 붙여서 바꿔줘
		car1.replaceAll(c -> "new" + c);
		System.out.println(car1);

		// 모든 원소에 대해서 꺼내서 출력 consumer (소비만하고 반환타입 없음)
		car1.forEach(c -> System.out.println(c));

		car1.clear();
		System.out.println(car1.isEmpty());
	}

}
