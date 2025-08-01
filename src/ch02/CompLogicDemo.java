package ch02;

public class CompLogicDemo {

	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		System.out.println(x < y); // 비교 연산
		System.out.println(x > y); // 비교 연산
		System.out.println(x > y && x == 0); // 논리 연산

		// 쇼트 서킷 (논리 &&) 조건식이 false 이면 조건식2 조사하지 않아, 성능 개선
		System.out.println(x > y && 5 / 0 == 0);

		// 쇼트 서킷 (논리 ||) 조건식1이 true 이면 조건식2 조사하지 않아, 성능 개선
		System.out.println(x < y || 5 / 0 == 0);
	}

}
