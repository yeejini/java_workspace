package ch11;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<>(); // 초기값 10개
		LinkedList<Integer> lList = new LinkedList<>();

		long start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.add(i);
		}
		long end = System.nanoTime();
		System.out.println("ArrayList: " + (end - start));

		start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			lList.addLast(i);
		}
		end = System.nanoTime();
		System.out.println("LinkedList: " + (end - start));

	}

}
