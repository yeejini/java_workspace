package ch03;

public class IncrementDemo {

	public static void main(String[] args) {
		int x = 0;

		System.out.println("main 에서 increment 호출하기 전: " + x);
		increment(x);
		System.out.println("main 에서 increment 호출 후: " + x);

	}

	public static void increment(int n) {
		System.out.println("increment 함수 메서드 시작: " + n);
		n++;
		System.out.println("increment 함수 메서드 종료: " + n);
	}

}
