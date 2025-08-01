package ch02;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		int x = 1, y;

		y = (x == 1) ? 10 : (5 / 0); // 쇼트 서킷

		System.out.println(y);

		int a, b, c;
		a = b = c = 3;

		c = a++ + --b * a;
		System.out.println(c);

	}

}
