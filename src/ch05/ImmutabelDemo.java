package ch05;

public class ImmutabelDemo {

	public static void main(String[] args) {

		// String Pool 사용
		// String은 Immutable(불변) 객체 성격을 가지고 있다.
		// 불변 객체이기에 사이드이팩트가 일어나지 않는다.
		// 참조형이지만, 기본형처럼 보인다.
		String str1 = "Hello";

		String str2 = "Hello";

		System.out.println(str1 == str2);

		str2 = "World";

		System.out.println(str1 == str2);
		System.out.println(str1 + ":" + str2);

		// 최적화 과정 전
		String str3 = new String("Hello");
		String str4 = new String("Hello");

		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4)); // 값이 같은지 비교할 때
	}

}
