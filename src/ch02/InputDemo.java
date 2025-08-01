package ch02;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // 데이터 타입을 in이라는 이름으로 객체 생성
//
//		System.out.print("정수 값을 입력하세요:");
//		int x = in.nextInt(); // int 값으로 받아옴
//		System.out.printf("당신이 입력한 값은 %d 입니다.", x);
//
//		System.out.print("\n 실수 값을 입력하세요:");
//		float f = in.nextFloat(); // float 값으로 받아옴
//		System.out.printf("당신이 입력한 값은 %f 입니다.", f);
//
//		System.out.print("\n정수 값을 입력하세요:");
//		String s = in.nextLine(); // string 값으로 받아옴
//		System.out.printf("당신이 입력한 값은 %s 입니다.", s);
//		int num = Integer.parseInt(s); // 형변환
//		System.out.printf("\ns + 10은 %d 입니다. \n", num + 10);
//		
		System.out.print("\n실수 값을 입력하세요:");
		String s = in.nextLine(); // string 값으로 받아옴
		System.out.printf("당신이 입력한 값은 %s 입니다.", s);
		double d = Double.parseDouble(s); // 형변환
		System.out.printf("\ns + 3.14은 %f 입니다. \n", d + 3.14);
	}

}
