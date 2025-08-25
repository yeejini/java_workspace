package ch11;

import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> fruits = Map.of("사과", 5, "바나나", 2, "포도", 10);

//		fruits.put("딸기", 5); // ImmutableCollections
//		fruits.put("사과", 3); // ImmutableCollections
		System.out.println(fruits.size()); // 사이즈나 꺼내는건 가능
		System.out.println(fruits.keySet());
		System.out.println(fruits.values());

		System.out.println(fruits.containsKey("사과"));

		// BiConsumer
		fruits.forEach((x, y) -> System.out.println(x + ":" + y));
//		fruits.forEach(System:println));

	}

}
