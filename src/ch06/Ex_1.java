package ch06;

public class Ex_1 {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		ColorCircle cc = new ColorCircle(10, "빨간색");
		c.show();
		cc.show();
	}

}

class Circle {
	int radius;

	void show() {
		System.out.println("반지름이 " + radius + " 인 원이다.");
	}

	// 생성자
//	Circle() {
//
//	}

	Circle(int radius) {
		this.radius = radius;
	}
}

class ColorCircle extends Circle {
	String color;

	@Override
	void show() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
	}

	ColorCircle(int radius, String color) {
		super(radius);
		this.radius = radius;
		this.color = color;
	}
}