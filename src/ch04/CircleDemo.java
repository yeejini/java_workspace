package ch04;

public class CircleDemo {

	public static void main(String[] args) {
//		Circle circle = new Circle(); //생성자를 만들면 디폴트 생성자 자동으로 만들어 주지 않는다.
//		circle.setRadius(10);  
//		System.out.println("원의 반지름은 " + circle.getRadius());
//		System.out.println("원의 넚이는 " + circle.findArea());

		Circle c = new Circle(2);
		System.out.println("원의 반지름은 " + c.getRadius());
		System.out.println("원의 넚이는 " + c.findArea());
	}

}

class Circle {
	// 멤버(필드)
	private double radius;
//	private double radius1;
//	private double radius2;
//	private double radius3;

	// 생성자
//	public Circle() {
//
//	}

	public Circle(double radius) { // double radius1, double radius2, double radius3
		if (radius > 0) {
			this.radius = radius;
//			this.radius1 = radius1;
//			this.radius2 = radius2;
//			this.radius3 = radius3;

		}
	}

	// Getter
	public double getRadius() {
		return radius;
	}

	// Setter
	public void setRadius(double r) {
		if (r <= 0) {
			System.out.println("원의 반지름은 0보다 커야 합니다.");
			return;
		}
		this.radius = r;

	}

	// 멤버(메서드)
	public double findArea() {
		return 3.14 * this.radius * radius;
	}
}