package ch05;

public class IncrementDemo {

	public static void main(String[] args) {
		int[] x = { 0 };
		System.out.println("함수 호출 전 x[0]: " + x[0]);
		increment(x);
		System.out.println("함수 호출 후 x[0] " + x[0]);
	}

	// int 타입의 배열 n을 매개변수로 넘기면 주소값이 들어감
	public static void increment(int[] n) {
		System.out.println("increment 메서드 시작의 n[0]값: " + n[0]);
		n[0]++; // 그 주소값의 실제 값 증가ㅓ
		System.out.println("increment 메서드 종료의 n[0]값: " + n[0]);
	}

}
