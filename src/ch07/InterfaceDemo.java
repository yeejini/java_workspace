package ch07;

public class InterfaceDemo {

	public static void main(String[] args) {

	}

}

interface A {
	void method1(); // public abstract 가 생략 되어 있음
//	void method2();

	default void method2() {

	}// 구현부 존재하므로 상속받은 자손들은 꼭 오버라이드해서 구현부 작성할 필요 없다.
}

class D1 implements A {
	@Override
	public void method1() {

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}
}
