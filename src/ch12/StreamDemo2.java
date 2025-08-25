package ch12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		int[] ia = { 1, 2, 3, 4, 5 };
		// Arrays 도움을 받아야지만 stream과 같은 메서드 사용 가능
		IntStream is = Arrays.stream(ia);

		String[] sa = { "a", "b", "c", "d", "e" };
		Stream<String> sss = Arrays.stream(sa);
		Stream<String> ss = Stream.of(sa); // alt+shift+l

		double[] da = { 1.0, 2.0, 3.0, 4.2, 5.3 };
		DoubleStream ds = DoubleStream.of(da);

		Random r = new Random();
		IntStream ints = r.ints(0, 100);

		ints.limit(10).forEach(n -> System.out.println(n));

		IntStream iterate = IntStream.iterate(1, i -> i * 2);
		iterate.limit(3).forEach(n -> System.out.println(n)); // 중간연산인 limit이 없으면 무한루프

		IntStream range = IntStream.range(1, 10);
		range.forEach(n -> System.out.println(n));

	}

}
