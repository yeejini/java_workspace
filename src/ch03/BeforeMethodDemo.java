package ch03;

public class BeforeMethodDemo {

	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum = sum + i;
//		}
		System.out.printf("1부터 10까지의 합은: %d \n", sum(1, 10));

//		sum = 0;
//		for (int i = 10; i <= 100; i++) {
//			sum = sum + i;
//		}
		System.out.printf("10부터 100까지의 합은: %d \n", sum(10, 100));

//		sum = 0;
//		for (int i = 100; i <= 1000; i++) {
//			sum = sum + i;        
//		}
		System.out.printf("100부터 1000까지의 합은: %d \n", sum(100, 1000));
	}

	public static int sum(int start, int stop) {
		int sum = 0;
		for (int i = start; i <= stop; i++) {
			sum = sum + i;
		}

		return sum;

	}

}