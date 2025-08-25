package ch09;

public class BoundTypeDemo {

	public static void main(String[] args) {
		BoundCup<Beer> c1 = new BoundCup<>();
		c1.setBeverage(new Beer());
//		c1.setBeverage(new Boricha()); /Beer만 가능
		BoundCup<Boricha> c2 = new BoundCup<>();

//		Bound<String> c3 = new BoundCup(); String은 Beverage를 상속받은 것이 아니기에 불가능

	}

}

//Beverage 타입으로 한정
class BoundCup<T extends Beverage> {
	private T beverage;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}