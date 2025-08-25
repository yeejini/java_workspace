package ch12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		// String이 흘러다니는 Stream
		Stream<String> of = Stream.of("a1", "b1", "c1", "c2", "c3");

		// Predicate 성질
		// c로 시작하는 것 다 꺼내
		Stream<String> filterOf = of.filter(s -> s.startsWith("c"));

		Stream<String> skipOf = filterOf.skip(2);

		skipOf.forEach(Util::print);
		System.out.println();

		// 최종연산
		// consumer 성질, Util로 넘김
//		filterOf.forEach(Util::print);
//		System.out.println();

		// stream에 대해 중간연산, 최종연산
		Stream.of("a1", "b1", "c1", "c2", "c3").filter(s -> s.startsWith("c")).skip(1).forEach(Util::print);

		// 중간연산은 계속 늘어날 수 있다.
		IntStream intof = IntStream.of(1, 2, 2, 3, 4, 4, 5, 6, 7);
		// Predicate, 짝수만 반환
		IntStream filterIntOf = intof.filter(n -> n % 2 == 0);
		System.out.println();
		// 중복제거
		IntStream distinct = filterIntOf.distinct();
		distinct.forEach(Util::printWithParenthesis);

		System.out.println("\n인구가 1억 이상인 나라: ");

		// stream을 쓰기위해 .stream을 붙여줌
//		List<Nation> nations = Nation.nations.stream();
		Stream<Nation> nations = Nation.nations.stream();

		Stream<Nation> nationsFilter = nations.filter(n -> n.getPopulation() > 100.0);
		nationsFilter.limit(2).forEach(Util::printWithParenthesis);

	}

}
