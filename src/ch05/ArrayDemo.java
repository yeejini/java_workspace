package ch05;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// 방법1
//		int[] scores = { 92, 100, 85, 78, 69, 88, 90, 100, 70, 76 };

		// 방법2
//		int[] scores2 = new int[] { 92, 100, 85, 78, 69, 88, 90, 100, 70, 76 };

		// 방법3
//		int[] scores3;
//		scores3 = new int[] { 92, 100, 85, 78, 69, 88, 90, 100, 70, 76 };

		// 방법4
		int[] scores5 = new int[5];
		for (int i = 0; i < scores5.length; i++) {
			scores5[i] = 90;
		}

//		int sum = 0;
//
//		for (int i = 0; i < scores.length; i++) {
//			sum = sum + scores[i];
//		}

//		int sum = 0;
//
//		for (int score: scores) { //for-each loop
//			sum = sum +score;
//			}

//		System.out.printf("학생 %d명의 점수의 합은 %d 입니다. \n", scores.length, sum);
//		System.out.printf("학생 %d명의 점수의 평균은 %.2f 입니다.\n", scores.length, (sum / (double) scores.length));

		// 배열의 출력
		int[] arr = { 1, 2, 3, 4, 5 };
		String str = "hello";
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(str);

		char[] cArr = { 'a', 'b', 'c' };
		System.out.println(cArr);

		double[] dArr = { 10.0, 20.0, 30.0 };
		System.out.println(dArr);
		System.out.println(Arrays.toString(dArr));

	}

}
