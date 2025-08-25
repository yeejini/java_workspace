package ch12;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

public class ReduceDemo2 {

	public static void main(String[] args) {
		// Nation 의 nations를 스트림으로 변환 후
		// GDP가 20위 이내인 나라들의 인구 수 총합을 구하라 (단위: 백만명)
		Stream<Nation> ns = Nation.nations.stream();
		double reduce = ns.filter(n -> n.getGdpRank() <= 20).mapToDouble(n -> n.getPopulation()).reduce(0.0,
				(n1, n2) -> n1 + n2);
		System.out.print("GDP가 20위 이내인 나라들의 인구 수 총합: ");
		System.out.println(reduce);

		// Nation 의 nations를 스트림으로 변환 후
		// 섬나라에 사는 인구 총합을 구하라. (단위: 백만명)
		ns = Nation.nations.stream();
		double reduce2 = ns.filter(n -> n.isIsland()).mapToDouble(n -> n.getPopulation()).reduce(0.0,
				(n1, n2) -> n1 + n2);
		System.out.print("섬나라에 사는 인구 총합: ");
		System.out.println(reduce2);

		ns = Nation.nations.stream();
		DoubleSummaryStatistics ss = ns.mapToDouble(Nation::getPopulation).summaryStatistics();
		System.out.println(ss);
	}

}
