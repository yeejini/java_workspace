package ch05;

public class mutableDemo {

	public static void main(String[] args) {
		Cat c1 = new Cat("나비"); // 주소 값 : 0x100

		Cat c2 = c1; // 같은 주소 값 공유 -> 0x100

		System.out.println(c1 + ":" + c2);
		System.out.println(c1.getName());
		System.out.println(c2.getName());

//		c2.setName("야옹이");

		c2 = new Cat("야옹이"); // 0x200
		System.out.println(c1.getName());
		System.out.println(c2.getName());

		int i = 1; // 값 복사
		int j = 1; // 값 복사

		System.out.println(i + ":" + j);

		j = 3;
		System.out.println(i + ":" + j);

	}

}

class Cat { // mutable ==> immutable
	private final String name; // final ==> name이 변하지 않게

	// 생성자
	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
}