package ch06.sec08;

public class Circle {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	// 최상위 조상인 Object의 객체 equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
//		return this.radius == obj.radius;//obj에는 radius가 없기에 오류
		if (obj instanceof Circle c) {
			return this.radius == c.radius;
		}
		return false;
	}

}
