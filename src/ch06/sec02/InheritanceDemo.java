package ch06.sec02;

public class InheritanceDemo {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.findArea();
		c.findRadius();

//		Circle.staticMethod(); // static 메서드

		Ball b = new Ball("빨간색");

		b.findRadius();
		b.findColor();
		b.findArea();
		b.findVolume();

		// 오버라이딩 불가
		// 1) private은 오버라이딩 대상 아님
		// 2) static 메서드는 오버라이딩 대상 아님
		// 3) final 메서드는 더이상 수정 불가, 자식 클래스가 오버라이딩 할 수 없음
		// 4) 오버라이딩할 때 접근제어자 줄일 수 없음
	}

}
