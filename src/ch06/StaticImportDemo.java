package ch06;

import static java.util.Arrays.sort;

import java.util.Arrays;
import java.util.Calendar;

public class StaticImportDemo {

	public static void main(String[] args) {
		int[] data = { 5, 3, 1, 2 };

		System.out.println(Arrays.toString(data));
		sort(data);
		System.out.println(Arrays.toString(data));

		Calendar c = Calendar.getInstance();
		System.out.println(Calendar.JANUARY); // Calendar가 가지고 있는 January라는 상수 값 사용
	}

}
