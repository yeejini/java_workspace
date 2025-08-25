package ch10;

public class LambdaDemo {

	public static void main(String[] args) {
//		(a, b) -> a>b ? a:b
//		Object obj = new Object() {
//			int max(int a, int b) {
//				return a > b ? a : b;
//			}
//		};
//
//		
//		int value = obj.max(2.3);

//		MyFunction f = new MyFunction() {
//			@Override
//			public int max(int a, int b) {
//				return a > b ? a : b;
//			};
//		};
		// MyFunction이라는 타입으로 upcasting
		MyFunction f = (a, b) -> a > b ? a : b;

		int value = f.max(3, 5);
		System.out.println(value);

//		f.max(3, 5);

		// 이름없는 클래스 안에 익명 메소드
		PrintFunction pf = (name, i) -> System.out.println(name + "=" + i);

		pf.printVar("hello", 3);

		// 유일한 메서드를 implement 필수
		SquareFunction sf = (int x) -> x * x;

		System.out.println(sf.square(3));
//
//		RollFunction rf = () -> (int) (Math.random() * 6) + 1;
//
//		for (int i = 0; i < 10; i++) {
//			System.out.println(rf.roll());
//		}

		YourFunction yf = (a, b) -> a < b ? a : b;

		System.out.println(yf.min(2, 5));

	}

}

//추상화 메서드 하나만 존재해야함
@FunctionalInterface
interface MyFunction {
	int max(int a, int b);
}

@FunctionalInterface
interface PrintFunction {
	void printVar(String name, int t);
}

@FunctionalInterface
interface SquareFunction {
	int square(int x);
}

@FunctionalInterface
interface RollFunction {
	int roll();
}

@FunctionalInterface
interface YourFunction {
	int min(int a, int b);
}

class MyClass implements MyFunction {

	@Override
	public int max(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}