package ch08;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random(21000);

		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextLong(2000000000L));
		}
	}

}
