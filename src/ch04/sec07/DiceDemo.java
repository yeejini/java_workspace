package ch04.sec07;

import java.util.Scanner;

public class DiceDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("몇 번 돌리겠습니까?: ");
		int n = in.nextInt();

		Dice dice = new Dice();

		for (int i = 0; i < n; i++) {
			dice.roll(); // 결과: 1부터 6사이의 값이 랜덤하게 출력
		}

	}

}

class Dice {

	void roll() {
		System.out.println(((int) Math.random() * 6) + 1);

	}

}