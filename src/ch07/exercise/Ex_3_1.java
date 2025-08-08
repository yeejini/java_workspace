package ch07.exercise;

public class Ex_3_1 {

	public static void main(String[] args) {
		Line l1 = new Line(30);
		Line l2 = new Line(20);

		System.out.println(l1);
		System.out.println(l2);

		// 길이가 같은지 비교하기 원함 -> equals를 오버라이드해야함
		System.out.println(l1.equals(l2)); // equals는 object의 것-> 같은 객체인가를 비교하는

		int result = l1.compareTo(l2);
		if (result > 0) {
			System.out.println(l1 + " 이 더 깁니다.");

		} else if (result < 0) {
			System.out.println(l2 + " 가 더 깁니다.");
		} else {
			System.out.println(l1 + "과 " + l2 + " 의 길이가 같습니다.");
		}

	}

}

class Line implements Comparable {
	int length;

	public Line(int length) {
		this.length = length;
	}

	// 길이비교를 위한 equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Line line) {
			return this.length == line.length;
		}
		return false;
	}

	// 누가 더 긴지 비교하기 위한 compareTo 오버라이딩
	@Override
	public int compareTo(Object o) {
		// obj이 Line 타입인지
		if (o instanceof Line line) {
			return this.length - line.length;
		}
		return 0;
	}

	// 문자열을 위한
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Line [length = %d]", length);
	}
}