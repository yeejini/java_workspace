package ch12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {

	public static void main(String[] args) {
		// 인터페이스 타입으로 변수 선언
		// upcasting되기에 다형성 특징을 활용
		List<Integer> list = new ArrayList<>();
		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			list.add(r.nextInt(30));
		}

		// 코드1
		List<Integer> gt10 = new ArrayList<>();

		for (Integer number : list) {
			if (number > 10) {
				gt10.add(number);
			}
		}
		Collections.sort(gt10);
		System.out.println(gt10);

		// collection인데 stream이고, integer가 흘러가는 형태
		// 중간연산 여러번, 최종 한번
		// filter, sorted, /forEach
		list.stream().filter(x -> x > 10).sorted().forEach(System.out::println);
//		.forEach(x -> System.out.println(x));
	}

}
