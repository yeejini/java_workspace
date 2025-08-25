package ch11.exercise;

import java.util.HashMap;
import java.util.Map;

public class Ex_5 {

	public static void main(String[] args) {
		Map<String, String> map = Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion");
		Map<String, String> animals = new HashMap<>(map);

//		Set<Map.Entry<String, String>> animalsEntry = animals.entrySet();
//		for(Map.Entry<String, String> entry:animalsEntry) {
//			System.out.println(entry.getKey() + );
//		}

		// 이미 Map은 toString이 내부적으로 구현되어 있기에, 그냥 animals 출력해도 무방하다.
		System.out.println("변경 전 : " + animals);
		animals.replaceAll((k, v) -> v.toUpperCase()); // Bifunction
		System.out.println("변경 후 : " + animals);

	}

}
