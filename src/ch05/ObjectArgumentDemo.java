package ch05;

public class ObjectArgumentDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(10.0);

		zero(c1);
		System.out.println("c1의 반지름: " + c1.radius);

		zero(c2.radius);
		System.out.println("c2의 반지름: " + c2.radius);
	}

	// 메소드는 같지만 매개변수 다른 오버로딩
	// 같은 일을 함

	// ReadWrite
	static void zero(Circle c) {
		c.radius = 0.0;
	}

	// ReadOnly
	static void zero(double r) {
		r = 0.0;
	}

}