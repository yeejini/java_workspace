package ch05;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// 데이터 타입
		// int를 객체 타입으로 변경해줘야함 -> Integer
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println(arrayList);
		System.out.println(arrayList.size());

		arrayList.add(10);
		arrayList.add(20);

		System.out.println(arrayList.size());
		System.out.println(arrayList);

	}

}
