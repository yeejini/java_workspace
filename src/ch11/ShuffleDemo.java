package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleDemo {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		// 65~71까지 반복
		for (char c = 'A'; c <= 'G'; c++) {
			list.add(c);
		}

		System.out.println("최초의 리스트: " + list);
		Collections.rotate(list, 3);
		System.out.println("3만큼 이동시킨 리스트: " + list);
		Collections.shuffle(list);
		System.out.println("랜덤하게 섞은 리스트: " + list);
	}

}
