package ch08.exercise;

import java.util.Random;

public class Ex_4 {

	public static void main(String[] args) {

		System.out.println(new Dice().roll());
	}

}

class Dice {
	Random r = new Random();

	public int roll() {
		return r.nextInt(1, 7);
	}
}