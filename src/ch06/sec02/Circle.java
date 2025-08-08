package ch06.sec02;

public class Circle {
	public static void staticMethod() {

	}

	private void secret() {
		System.out.println("비밀입니다.");
	}

	protected void findRadius() {
		System.out.println("반지름은 10.0cm입니다.");
	}

	public void findArea() {
		System.out.println("원의 넓이는 PI * 반지름 * 반지름");
	}

	// final 상수
	public final void findFinal() {

	}

}
