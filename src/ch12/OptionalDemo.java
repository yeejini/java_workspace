package ch12;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Integer i = null;
		Optional<Integer> e = Optional.empty();
		System.out.println(e);
		System.out.println(e.isEmpty());

		Optional<Integer> of = Optional.of(3);
		System.out.println(of);
		System.out.println(of.get());

		Optional<Integer> ofNullable = Optional.ofNullable(i); // null이면 empty, 아니면of를 반환

		System.out.println(ofNullable);

		i = 10;
		ofNullable = Optional.ofNullable(i);
		System.out.println(ofNullable);

		if (!ofNullable.isEmpty()) {
			// 값이 존재할 때만 출력해.
			System.out.println(ofNullable.get());
		}
		// 밖에서 쓸때는 c.get을 해야하는데, isPresent를 쓰면 알아서 값이 꺼내진다.
		i = null;
		ofNullable.ifPresent(System.out::println);

		ofNullable = Optional.ofNullable(i);
		ofNullable.ifPresentOrElse(System.out::println, () -> System.out.println("값이 없습니다."));
	}

}
