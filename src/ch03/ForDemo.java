package ch03;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Hello World , " + (i + 1));
//			// 1부터 10까지 정수를 출력
//			System.out.printf("%d", (i + 1));
//
//		}
//		for (int i = 10; i >= 1; i--) {
//			System.out.println(i);
//		}
//		for (int i = 11; i <= 20; i++) {
//			System.out.println(i);
//		}

		for (int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
		Scanner in = new Scanner(System.in);
		System.out.println("몇단 입력할지 작성: (2~19)");

		int dan = in.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d", dan, i, 2 * i);
		}

	}

}
