package ch12;

import java.util.Optional;

public class Optional2Demo {

	public static void main(String[] args) {
		String s = "hello";
		String s1 = null;

		// hello를 감싸서 출력
		Optional<String> o = Optional.ofNullable(s);
		Optional<String> o1 = Optional.ofNullable(s1);

		if (o.isPresent()) {
			Util.print(o.get());
		} else {
			String s2 = o.orElse("빈 문자열");
			Util.print(s2);
		}

		System.out.println(o.get());
		// 예외오류 발생
//		System.out.println(o1.get());

	}

}
