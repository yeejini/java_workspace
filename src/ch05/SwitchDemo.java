package ch05;

public class SwitchDemo {

	public static void main(String[] args) {
		// 클래스 타입처럼 사용
		NewGender gender = NewGender.여성;

		String s = switch (gender) {
		case 남성 -> "은 병역의무가 있다.";
		case 여성 -> "은 병역의무가 없다.";
		default -> "*";
		};
		System.out.println(gender + s);
	}

}

enum NewGender {
	// 남성이라는 상수값이지만, heap영역에 객체를 가리키고 있다.
	남성, 여성
}