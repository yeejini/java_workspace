package ch12.exercise;

import java.util.List;
import java.util.stream.Stream;

public class Ex_3 {

	public static void main(String[] args) {
		Stream<String> stream = List.of("갈매기", "나비", "다람쥐", "라마").stream();
		stream.filter(n -> n.length() == 2).forEach(System.out::println);
	}

}
