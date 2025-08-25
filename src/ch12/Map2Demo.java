package ch12;

public class Map2Demo {

	public static void main(String[] args) {
//		Nation.nations 리스트를 스트림으로 생성한 후
//		나라이름만을 가지고 스트림으로 변환하고
//		그 중 4개의 나라이름만 ( ) 로 감싸서 출력
		Nation.nations.stream().map(n -> n.getName()).limit(4).forEach(Util::printWithParenthesis);
		System.out.println();

//		Nation.nations 리스트를 스트림으로 생성한 후
//		각 나라의 인구 수 만을 가지고 스트림으로 변환하고
//		인구 수를 ( ) 로 감싸서 출력
		Nation.nations.stream().mapToDouble(n -> n.getPopulation()).forEach(Util::printWithParenthesis);
		System.out.println();
		// Nation.nations 리스트를 스트림으로 생성한 후
//		각 나라의 GdpRank 만을 가지고 스트림으로 변환하고
//		GdpRank를 ( ) 로 감싸서 출력
		Nation.nations.stream().mapToInt(n -> n.getGdpRank()).forEach(Util::printWithParenthesis);
		System.out.println();
	}

}
