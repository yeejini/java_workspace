package ch07.exercise;

public class Ex_3_2 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(1, 2);
		Triangle t2 = new Triangle(1, 2);

		int result = t1.compareTo(t2);
		System.out.println(result);

		if (result > 0) {
			System.out.println(t1 + "이 더 큽니다");
		} else if (result < 0) {
			System.out.println(t2 + "가 더 큽니다");
		} else if (result == 0) {
			System.out.println(t1 + "과 " + t2 + "의 넓이가 같습니다.");
		} else {
			System.out.println("비교할 수 없습니다.");
		}
	}

}

class Triangle implements Comparable {
	int width;
	int height;

	Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int area() {
		return width * height / 2;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Triangle tri) {
			return this.area() - ((Triangle) o).area();
		}
		return 0;
	}

	@Override
	public String toString() {
		return String.format("[width= %d, height= %d, 넓이= %d]", width, height, area());
	}

}