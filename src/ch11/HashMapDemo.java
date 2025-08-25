package ch11;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("사과", 5, "바나나", 2, "포도", 10);
		Map<String, Integer> fruits = new HashMap<>(map);

		fruits.put("딸기", 5);
		fruits.put("사과", 3);
		// 참조변수 이므로 null 저장 가능
		fruits.put(null, null);
		System.out.println(fruits.size()); // 사이즈나 꺼내는건 가능
		System.out.println(fruits.keySet());
		System.out.println(fruits.values());

		// Map이 만든 Entry형태로 들어감
		// key로 밖에 접근을 못하므로 한번에 value를 바꾸고 싶을 때, entrySet 사용
		Set<Map.Entry<String, Integer>> fruitsEntry = fruits.entrySet();
		for (Map.Entry<String, Integer> entry : fruitsEntry) {
			entry.setValue(10);
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.out.println(fruits.containsKey("사과"));

		// BiConsumer
		fruits.forEach((x, y) -> System.out.println(x + ":" + y));
//		fruits.forEach(System:println));

		Map<String, Integer> fruitsHashTable = new Hashtable<>(map);
		// hashtable은 null불가
//		fruitsHashTable.put(null, null);

	}

}
