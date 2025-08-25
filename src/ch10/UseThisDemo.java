package ch10;

public class UseThisDemo {

	public static void main(String[] args) {
//		UseThisDemo demo = new UseThisDemo();
//		demo.lambda();
		new UseThisDemo().lambda();
	}

	public void lambda() {
		String hi = "Hi";

		// 인터페이스의 구현체
		// 익명 클래스 구현체
		UseThis u = new UseThis() {
			// 구현부 안에서의 this
//			익명 내부 클래스 내에서의 this는 익명 클래스 자신
			@Override
			public void use() {
				System.out.println(this);
			}

//			@Override
//			public String toString() {
//				// TODO Auto-generated method stub
//				return String.format(hi);
//			}

		};
		u.use();

		UseThis u1 = new UseThis() {
			// 구현부 안에서의 this
//			익명 내부 클래스 내에서의 this는 익명 클래스 자신
			@Override
			public void use() {
				System.out.println(this);
			}

//			@Override
//			public String toString() {
//				// TODO Auto-generated method stub
//				return String.format(hi);
//			}

		};
		u1.use();

//		
//		람다식은 자신만의 this를 갖지 않음 →
//		this는 람다를 포함하고 있는 외부 클래스 인스턴스 (UseThisDemo 인스턴스)를 가리킵니다.
		UseThis u2 = () -> System.out.println(this);
		u2.use();

	}

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return String.format();
//	}

}

interface UseThis {
	void use();
}