package ch09;

import ch06.sec02.Ball;

public class GenericClassDemo {

	public static void main(String[] args) {
		Cup c = new Cup();

		c.setBeverage(new Beer());
		Object o = c.getBeverage();
		Beer b = (Beer) o;
		b.drink();

		Cup c1 = new Cup();

		// Object로 다 받을 수 있기 때문에 다 담을 수 있음
		c1.setBeverage(new Boricha());
		c1.setBeverage(new Beer());
		c1.setBeverage(new Ball("red"));

		Object o1 = c1.getBeverage();
		if (o1 instanceof Beer b1) {
			b1.drink();
		}
		if (o1 instanceof Boricha b2) {
			b2.notdrink();
		}
	}

}

class Cup {
	private Object beverage;

	public Object getBeverage() {
		return beverage;
	}

	// 컵에 내용물 담는 설정자
	public void setBeverage(Object beverage) {
		this.beverage = beverage;
	}
}

class Beverage {

}

class Beer extends Beverage {

	@Override
	public String toString() {
		return "Beer 입니다";
	}

	void drink() {
		System.out.println("맥주를 마신다.");
	}
}

class Boricha extends Beverage {

	@Override
	public String toString() {
		return "Boricha 입니다";
	}

	void notdrink() {
		System.out.println("보리차를 마신다.");
	}
}
