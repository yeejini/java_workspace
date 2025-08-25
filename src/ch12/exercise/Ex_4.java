package ch12.exercise;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex_4 {

	public static void main(String[] args) {
		Stream<String> stream = List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던").stream();
		Optional<String> first = stream.sorted().findFirst();
		first.ifPresent(System.out::println);
	}

}
