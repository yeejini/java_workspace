package ch12;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LoopDemo {

	public static void main(String[] args) {
		Stream<Nation> nationStream = Nation.nations.stream();

		System.out.println("before");
		// 골라만 놧다가
		Stream<Nation> peek = nationStream.filter(n -> n.isIsland()).peek(Util::printWithParenthesis);
		System.out.println("after");
		// 최종연산을 만낫을 때 실행
		peek.mapToInt(n -> n.getName().length()).forEach(Util::print);
//		peek.filter(n -> n.isIsland()).forEach(Util::printWithParenthesis);

		IntStream is = IntStream.of(1, 2, 3, 4, 5);
		OptionalInt min = is.min();
		// optional이므로 get으로 꺼내야 한다.
		System.out.println("\n최소값은: " + min.getAsInt());

		is = IntStream.of(1, 2, 3, 4, 5);
		OptionalInt max = is.max();
		System.out.println("최대값은: " + max.getAsInt());

		is = IntStream.of(1, 2, 3, 4, 5);
		OptionalDouble average = is.average();
		System.out.println("평균은: " + average.getAsDouble());

		is = IntStream.of(1, 2, 3, 4, 5);
		System.out.println("합은: " + is.sum());

		is = IntStream.of(1, 2, 3, 4, 5);
		System.out.println("개수는: " + is.count());
	}

}
