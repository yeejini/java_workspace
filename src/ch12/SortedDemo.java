package ch12;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {

	public static void main(String[] args) {
		// 문자열을 스트림으로 변환하고, 문자열을 정렬해서 출력
		Stream.of("d", "e", "a", "c", "b").sorted().forEach(System.out::println);

		//
		Stream<Integer> dscSorted = Stream.of(3, 5, 1, 7, 9);
		dscSorted.sorted().forEach(System.out::println);

		Stream<Integer> dsc = Stream.of(3, 5, 1, 7, 9);
//		dsc.sorted(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				//역정렬  
//				return o2-o1;
//			}
//			
//		})
//		.forEach(System.out::println);

		// 위를 람다로 변환
		dsc.sorted((o1, o2) -> o2 - o1).forEach(System.out::println);

		// 국가 이름 순서대로 출력
		// 이름 기준으로 comparing
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getName)).forEach(Util::printWithParenthesis);
		System.out.println();

		// 국가별 GdpRank 순서대로 출력
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getGdpRank)).forEach(Util::printWithParenthesis);
		System.out.println();

		// 국가별 인구수대로(인구가 적은 나라부터) 출력
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getPopulation)).forEach(Util::printWithParenthesis);
		System.out.println();

		// 국가별 인구수대로(인구가 많은 나라부터) 출력
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getPopulation).reversed())
				.forEach(Util::printWithParenthesis);
		System.out.println();
	}

}
