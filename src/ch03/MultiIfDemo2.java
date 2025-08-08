package ch03;

import java.util.Scanner;

public class MultiIfDemo2 { // 다중 if문

	public static void main(String[] args) {
		// 입력을 받는다
		Scanner in = new Scanner(System.in);
		System.out.println("학생의 점수를 입력하세요: ");
		int score = in.nextInt();
		String grade = "";

		if (score >= 70 && score < 80) { // C
			if (score >= 70 && score < 75) {
				grade = "C0";
			} else {
				grade = "C+";
			}
		} else if (score >= 80 && score < 90) {
			if (score >= 80 && score < 85) {
				grade = "B+";
			} else {
				grade = "B0";
			}
		} else if (score >= 90 && score <= 100) {
			if (score >= 90 && score < 95) {
				grade = "A0";
			} else {
				grade = "A+";
			}
		} else {
			grade = "F";
		}
		System.out.printf("당신의 학점은 %s입니다.", grade);
		// 다중 if 문으로
	}

}