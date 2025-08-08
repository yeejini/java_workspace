package ch07;

public class AbstractClassDemo {

	public static void main(String[] args) {
//		Shape sh = new Shape(); //객체 생성 불가
	}

}

abstract class Shape {
	double pi = 3.14;

	abstract void draw(); // 선언부만 있고 구현부는 없음

	public double findArea() {
		return pi * 1;
	}
}

class Circle extends Shape {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	void draw() { // 완성품을 만들 수 있는 설계도인데, Shape는 구현부가 없기에 마저 완성시켜쥼
		System.out.println("원을 그리다.");
	}

	@Override
	public double findArea() {
		return radius * radius * pi;
	}

}

class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("삼각형을 그리다.");
	}

}