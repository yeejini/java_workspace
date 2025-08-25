package ch11.exercise;

import java.util.HashMap;
import java.util.Map;

public class Ex_7 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 30);
		map.put("hong", 20);
		map.put("white", 40);

		String name = "";
		int maxScore = 0;
		int minScore = 100;
		double avg = 0;

//		System.out.println(map.values());
		for (int i : map.values()) {
			if (i < minScore) {
				minScore = i;
			}
			if (i > maxScore) {
				maxScore = i;
			}
		}

		double sum = 0;
		for (int a : map.values()) {
			sum += a;
			avg = sum / map.size();
		}

		System.out.println("평균은 " + avg + "이며 " + "최고 점수는 " + maxScore + ", 최저 점수는 " + minScore + "입니다.");

	}

}
