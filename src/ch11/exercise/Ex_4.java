package ch11.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		ArrayList<Integer> score = new ArrayList<>();

		Scanner in = new Scanner(System.in);

		scoreInput(in, score);

	}

	public static void scoreInput(Scanner in, ArrayList<Integer> scores) {
		int s = 0;

		while (s != -1) {
			System.out.println("점수를 입력하세요 : ");
			s = in.nextInt();
			if (s != -1) {
				scores.add(s);
			}
		}
		System.out.println("전체 학생은 " + scores.size() + "명이다.");

		System.out.print("락생들의 성적: ");
		for (Integer score : scores) {
			System.out.print(score + "\t");
		}

//		System.out.println(score);
		int max = 0;
		for (Integer num : scores) {
			if (num > max) {
				max = num;
			}
		}
//		System.out.println(max);
		int i = 0;

		String grade = "";
		for (Integer integer : scores) {
			if (integer > max - 10) {
				grade = "A";
			} else if (integer > max - 20) {
				grade = "B";
			} else {
				grade = "C";
			}
			System.out.println(i + "번 학생의 성적은 " + integer + "점이며 등급은" + grade + "이다.");
			i++;
		}
	}

}
