package ch03;

public class MyMethodMain {

	public static void main(String[] args) {
		MyMethod math = new MyMethod(); // 계산기 객체 생성
		System.out.println(math.add(2, 3));
		System.out.println(math.sub(2, 3));
		System.out.println(math.mult(2, 3));
		System.out.println(math.div(2, 0));
		System.out.println(math.div(2, 3));

	}

}
