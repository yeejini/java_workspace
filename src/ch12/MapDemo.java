package ch12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("a1", "b1", "c1", "c2", "c3");
		// function
		Stream<String> map = s1.map(s -> s.toUpperCase());
		map.forEach(Util::print);
		System.out.println();

		// 흘러다니는건 Stream, 내용물이 Ingeger
		Stream<Integer> intof = Stream.of(1, 2, 2, 3, 4, 4, 5, 6, 7);
		Stream<Integer> map2 = intof.map(n -> n * 2);
		map2.forEach(Util::print);
		System.out.println();

		// stream은 한 번 실행하면 끝이므로 한 번 더 호출 불가
//		s1.forEach(Util::print);
		s1 = Stream.of("a1", "b1", "c1", "c2", "c3");
		Stream<String> num = s1.map(s -> s.substring(1));
		IntStream mapToInt = num.mapToInt(n -> Integer.parseInt(n));
		Stream<String> mapToObj = mapToInt.mapToObj(n -> n + "");

		// steam은 일회성이므로 두번호출 불가
//		mapToInt.forEach(Util::print);
		mapToObj.forEach(Util::print);
	}

}
