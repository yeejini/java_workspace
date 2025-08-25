package ch11.exercise;

import java.util.ArrayList;

public class Ex_1 {

	public static void main(String[] args) {
//		List<String> list = List.of("나비	", "다람쥐", "라마");
//
//		// ArrayList는 추가가능 동적
//		List<String> animals = new ArrayList<>(list);
		ArrayList<String> animals = new ArrayList<>();
		animals.add("갈매기");
		animals.add("나비");
		animals.add("다람쥐");
		animals.add("라마");

		for (String animal : animals) {
			if (animal.length() == 2) {
				System.out.println(animal);
			}
		}
	}

}
