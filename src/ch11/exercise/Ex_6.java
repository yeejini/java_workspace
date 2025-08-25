package ch11.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex_6 {

	public static void main(String[] args) {
		// 로또 6/45 생성
		Random r = new Random();
		List<Integer> list = new ArrayList<>();
		int number = 0;

		while (true) {
			if (list.size() >= 6) {
				break;
			}
			number = r.nextInt(1, 46);
			if (list.contains(number)) {
				continue;
			} else {
				list.add(number);
			}
		}
		Collections.sort(list);
		System.out.println(list);

	}

}
