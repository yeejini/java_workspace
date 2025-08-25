package ch10;

import java.util.Arrays;

public class ComparableDemo {

	public static void main(String[] args) {
		RectAngle[] rectAngles = { new RectAngle(3, 5), new RectAngle(2, 10), new RectAngle(5, 5), };

		// Comparable이 있어야 객체끼리 비교가능한데,
		// 비교 불가
		Arrays.sort(rectAngles); // CompareTo

		System.out.println(rectAngles);
	}

}

class RectAngle implements Comparable<RectAngle> {
	int width, height;

	public RectAngle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int findArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return String.format("사각형 [폭 = %d, 높이 = %d]", width, height);
	}

	@Override
	public int compareTo(RectAngle o) {
		return 0;
	}
}