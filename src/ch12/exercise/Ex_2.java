package ch12.exercise;

import java.util.stream.Stream;

public class Ex_2 {

	public static void main(String[] args) {
		Stream<String> of = Stream.of("a1", "a2", "a3");
		of.map(s -> s.substring(1));
//		.mapToInt(Integer::pareInt)
//		.max()
//		.ifPresent
	}

}
