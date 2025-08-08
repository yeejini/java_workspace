package ch08;

import java.util.Objects;

public class ObjectMethodDemo {

	public static void main(String[] args) {
		Mouse m1 = new Mouse("Logitech", 35000);
		Mouse m2 = new Mouse("Logitech", 35000);
		Mouse m3 = m1;// m1의 주소 할당

		// 가격까지 같아야 같음을 출력
		Keyboard k1 = new Keyboard("Microsoft", 58000);
		Keyboard k2 = new Keyboard("Microsoft", 58000);

		System.out.println(m1.toString()); // toString을 오버라이드하지 않앗기에 Object 것을 사용하므로 주소값 출력
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		System.out.println(k1.toString());
		System.out.println(k1);

		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(k1.equals(k2));
	}

}

//숫자의 hash값은 자기 자신이다
//
class Mouse {
	String name;
	int price;

	public Mouse(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// String에 대해서 이미 equals에서 구현이 되어 있으므로 hash오버라이딩 할 필요없이 구현
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else {
			if (obj instanceof Mouse m) {
				return this.hashCode() == m.hashCode();
			}
		}
		return false;
//		if (obj instanceof Mouse m) {
//			if (name.equals(m.name)) {
//				return true;
//			}
//		}
//		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
}

class Keyboard {
	String name;
	int price;

	public Keyboard(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// 타입이 키보드이면서 이름이 같은 경우에만 true
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else {
			if (obj instanceof Keyboard k) {
				return this.hashCode() == k.hashCode();
			}

		}
		return false;

//		if (obj instanceof Keyboard k) {
//			if (name.equals(k.name)&& price == k.price) {
//				return true;
//			}
//		}
//		return false;

	}

	// 여러 필드 값이 같아야 할 때, 모든 값이 equals로 구현하기 번거로움 -> hashCode 사용
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
}