package ch03;

public class WhileDemo {

	public static void main(String[] args) {
		// 무한반복문

		// 총 3개의 반복문의 횟수를 한번에 변경할 수 있도록 프로그램 수정 -> 리펙토리 과정
		int count = 5;

		// 초기식
		int i = 0;
		while (i < count) {
			// 반복 실행문
			System.out.println("loop" + i);
			i++;
		}

		for (int j = 0; j < count; j++) {
			System.out.println("loop" + j);
		}

		int k = 0;
		while (true) {
			// 반복 실행문
			System.out.println("loop" + k);
			k++;
			if (k >= count) {
				break;
			}

		}
	}

}
