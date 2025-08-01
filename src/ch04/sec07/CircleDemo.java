package ch04.sec07;

public class CircleDemo {

	public static void main(String[] args) {
		System.out.println(Circle.numOfCircles);

		Circle c1 = new Circle(10.0);
		System.out.println(Circle.numOfCircles);
		System.out.println(c1.numCircles);
		System.out.println(c1.numOfCircles);
		// numOfCircles: 객체들끼리 공유하는 변수

		Circle c2 = new Circle(5.0);
		System.out.println(Circle.numOfCircles);
		System.out.println(c2.numCircles);

	}

}

class Circle {
	// 인스턴스 변수
	double radius;
	int numCircles = 0;

	// 정적(static, 클래스) 변수
	static int numOfCircles = 0; // new를 생성하지 않아도 static변수 이므로 메모리에 할당

	// 생성자
	public Circle(double radius) {
		this.radius = radius;
		numCircles++;
		numOfCircles++;
	}

}
