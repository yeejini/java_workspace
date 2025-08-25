package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EtcDemo {

	public static void main(String[] args) {
		List<String> list = List.of("사과", "포도", "수박", "사과", "키위", "망고", "사과"); // immutable
		List<String> fruits = new ArrayList<String>(list); // mmutable

		Collections.sort(fruits);
		System.out.println(fruits);

		// 반을 나눠서 찾는 기법
		System.out.println(Collections.binarySearch(fruits, "사과"));
		// "사과"가 몇개 있는지
		System.out.println(Collections.frequency(fruits, "사과"));

	}

}
