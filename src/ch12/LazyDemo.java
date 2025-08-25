package ch12;

import java.util.stream.IntStream;

public class LazyDemo {

	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5); // 유한 반복 5포함, 1,2,3,4,5
		is.filter(x -> {
			// 중간과정
			System.out.println("filter() : " + x);
			return x % 2 == 0;
		}) // predicate
				.map(x -> {
					System.out.println("map() : " + x);
					return x * x;
				}) // IntUnaryOperator
				.forEach(x -> System.out.println("forEach() : " + x)); // Consumer
	}

}
