package ch12;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo2 {

	public static void main(String[] args) {
		Stream<Nation> ns = Nation.nations.stream();

		Stream<String> map = ns.map((Nation n) -> n.getName());
		Stream<String> limit = map.limit(3);
		List<String> collect = limit.collect(Collectors.toList());

//		for (String string : collect) {
//
//		}
		// collection framwork는 데이터를 잘 관리하기 위한 것이므로 내부에 toString이 구현되어 있음
		System.out.println(collect);

		ns = Nation.nations.stream();
		Set<String> collect2 = ns.map(Nation::getName).limit(3).collect(Collectors.toSet());
		System.out.println(collect2);

		ns = Nation.nations.stream();
		// toMap으로 값을 두 개 뽑아서 Map을 만듬
		Map<String, Double> collect3 = ns.filter(Nation::isIsland)
				.collect(Collectors.toMap(Nation::getName, Nation::getPopulation));
		System.out.println(collect3);

	}

}
