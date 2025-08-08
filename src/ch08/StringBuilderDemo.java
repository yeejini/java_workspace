package ch08;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String s = "hi"; // String pool을 공유
		String ss = "hello";

		// string pool에 hi를 가리키고 있다가 hi!를 s가 다시 가리킴
		s = s + "!";

		// hashCode는 메모리상의 주소값을 출력
		System.out.println(s.hashCode());
		System.out.println(ss.hashCode());

		String s1 = new String("hello"); // 객체를 만들 때마다 haap영역을 새로 만들어서 사용
		String s2 = new String("hello");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		StringBuilder sb = new StringBuilder("hello world");
		System.out.println(sb.hashCode());

		sb.append("!");
		System.out.println(sb.hashCode());

		sb.replace(7, 12, "java");
		System.out.println(sb.hashCode());
	}

}
