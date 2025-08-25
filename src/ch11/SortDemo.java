package ch11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		String[] fruits = { "포도", "수박", "사과", "키위", "망고" };
//		배열 상태에서 collections못씀 collections 패밀리로 바꿔야함
		List<String> list = Arrays.asList(fruits);

		// 리버스 오더로 출력
		// Reverse_Order로 정렬하기 위한 Comparator 반환해주는 메서드
		// Collections의 sort는 List 의 자식들인 ArrayList, LinkedList, stack만 가능/ Set이나 Map은
		// 불가능
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

		// 리버스 되어있는걸 뒤집음 = 순서대로 정렬
		Collections.reverse(list);

		System.out.println(list);

	}

}
