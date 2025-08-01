package ch05;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 스캐너 객체 할당
		Scanner in = new Scanner(System.in);
		// 배열 선언: 크기가 100 이고, 점수를 담고 있는 배열
		int[] scores = new int[100];
//		System.out.println(Arrays.toString(scores));

		// 표준입력장치에서 원하는 숫자만큼 점수를 입력받아서 배열에 저장, 종료하려면 -1을 입력
		int count = 0;
		int score = 0;
		System.out.println("학생의 점수를 입력: ");
		while (true) {
			score = in.nextInt();
//			System.out.println(Arrays.toString(scores));
			if (score == -1) {
				break;
			}
			scores[count++] = score;
		}
		// 입력받은 학생이 몇명이 count

		// 배열에서 count 해놓은 학생 수 만큼 점수를 꺼내서 합계를 구하고, 평균을 구하여 출력
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += scores[i];

		}

		System.out.printf("학생 %d명의 점수의 합은 %d 입니다. \n", count, sum);
		System.out.printf("학생 %d명의 점수의 평균은 %.2f 입니다.\n", count, (sum / (double) count));

	}

}
