package ch03;

import java.util.Scanner;

public class MultiIfDemo {

	public static void main(String[] args) {
		// 입력을 받는다
		Scanner in = new Scanner(System.in);
		System.out.println("학생의 점수를 입력하세요: ");
		int score = in.nextInt();
		String grade = "";

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80 && score <= 90) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.printf("당신의 학점은 %s입니다.", grade);
		// 다중 if 문으로
	}

}
