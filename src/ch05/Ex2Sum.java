package ch05;

public class Ex2Sum {

	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4));
		int arr[] = { 2, 3 };
		System.out.println(sum(1, arr));
		System.out.println(sum(1, 2, 3, 4, 5));
	}

	public static int sum(int number, int... numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}
}
