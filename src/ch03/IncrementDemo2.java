package ch03;

public class IncrementDemo2 {

	public static void main(String[] args) {

		RefValue ref = new RefValue(); // 객체 생성

		System.out.println("main 에서 increment 호출하기 전: " + ref.x);
		increment(ref); // 주소 값 호출
		System.out.println("main 에서 increment 호출 후: " + ref.x);

	}

	public static void increment(RefValue ref) {
		System.out.println("increment 함수 메서드 시작: " + ref.x);
		ref.x++; // 해당 주소값의 x 값 증가
		System.out.println("increment 함수 메서드 종료: " + ref.x);
	}

}

class RefValue {
	int x; // 자동 0 초기화

}