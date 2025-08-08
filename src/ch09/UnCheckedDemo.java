package ch09;

import java.util.StringTokenizer;

public class UnCheckedDemo {

	public static void main(String[] args) {
//		int res = 5 / 0; // ArithmeticException

//		String str = ""; // 초기값 부여 //0

//		String str = null; //
//		System.out.println(str.length()); // NullPointerException

//		int[] arr = null;
//		System.out.println(arr.length); // NullPointerException
//
		int[] arr1 = new int[0]; // 초기값 부여
//		System.out.println(arr1.length);

//		System.out.println(arr1[3]); // ArrayIndexOutOfBoundsException

		String s = "a b c";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());

		}
//		st.nextToken(); //NoSuchElementException
	}

}
