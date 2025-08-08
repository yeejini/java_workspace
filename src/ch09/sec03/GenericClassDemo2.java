package ch09.sec03;

import java.util.ArrayList;

public class GenericClassDemo2 {

	public static void main(String[] args) {
		Cup<Beer> beerCup = new Cup<>();

//		beerCup.setBeverage(new Ball("red")); // Beer만 담을 수 있기 때문에 오류
//		beerCup.serBeverage(new Boricha());

		beerCup.setBeverage(new Beer());
		Beer b = beerCup.getBeverage();

		Cup<Boricha> boriCup = new Cup<>();

		ArrayList<Integer> intArr = new ArrayList<>();
//		intArr.add("str");
//		intArr.add(0.2f);
		intArr.add(10); // 자동 박싱돼서 integer타입으로 자동

		int i = intArr.get(0);
		System.out.println(i);

		// 담을 때는 문제가 없지만,
		ArrayList list = new ArrayList(); // raw type으로 사용 권장하지 않는다.
		list.add(10);
		list.add(10.0);
		list.add("Hello");
		list.add(new Beverage());

		// 꺼낼때, 어느 타입인지 알 수 가 없음.
		// Beverage인데 Integer으로 형변환 해서 오류
		// 컴파일 오류는 발생하지 않음\
		// 구체적인 클래스 타입을 선언하고 쓰는 것을 권장
		System.out.println(list);
		Integer i2 = (Integer) list.get(3);

	}

}

class Cup<T> {
	private T beverage;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}

class Beverage {

}

class Beer extends Beverage {
	void drink() {
		System.out.println("맥주를 마신다.");
	}
}

class Boricha extends Beverage {
	void notdrink() {
		System.out.println("보리차를 마신다.");
	}
}