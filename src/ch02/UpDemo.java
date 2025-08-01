package ch02;

public class UpDemo {

	public static void main(String[] args) {
		int j, k, i = 3;

//		j = i++; // 후위연산

		k = ++i; // 전위 연산

//		System.out.printf("%d, %d", j, i);
		System.out.printf("%d, %d", k, i);
	}

}
