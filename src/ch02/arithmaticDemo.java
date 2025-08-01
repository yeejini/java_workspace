package ch02;

public class arithmaticDemo {

	public static void main(String[] args) {
		long l = 100L;
		int i = 10;

		long result = l + i;
		System.out.printf("%d 와 %d 의 + 연산 결과는 %d 입니다. \n", l, i, result);

		double d = 100.0;
		int i1 = 10;

		double result1 = d + i1;
		System.out.printf("%f 와 %d 의 + 연산 결과는 %f 입니다. \n", d, i1, result1);

		// 오버플로우, 언더플로우
		int a = 1_000_000; // -128~ 127
		int b = 2_000_000;

//		int res = a * b; 오버플로우
//		long res = a * b; 
		long res = (long) a * b;

		System.out.printf("%d 와 %d 의 + 연산 결과는 %d 입니다. \n", a, b, res);

		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;

		double res2 = apple - pieceUnit * number;
		System.out.println(res2);

		// 나누기, 나머지 연산 (0, 0.0 나누거나 나머지 연산 추의)
		int zero = 0;
		double zero1 = 0.0;
//		int res3 = 5 / zero;

		System.out.println(5 / zero1);
		System.out.println(5 % zero1);

		int res3 = 4 / 3;
		double res6 = (double) 4 / 3;
		System.out.println(res3);
		System.out.println(res6);

		// 짝수, 홀수 % 연산
		int three = 3;
		int res4 = three % 2;
		System.out.println(res4);

		int four = 4;
		int res5 = four % 2;
		System.out.println(res5);

	}

}
