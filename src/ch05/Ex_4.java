package ch05;

import java.util.Arrays;

public class Ex_4 {

	public static void main(String[] args) {
		String[] name = { "가위", "바위", "보" };
		System.out.println(name);
		System.out.println(Arrays.toString(name));
		for (int i = 0; i < 10; i++) {
			int n = (int) (Math.random() * 3);
			System.out.println((int) (Math.floor(Math.random() * 3)));
			String res = name[n];
			System.out.println(res);

		}
	}

}