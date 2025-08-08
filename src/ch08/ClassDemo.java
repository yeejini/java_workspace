package ch08;

public class ClassDemo {

	public static void main(String[] args) {
		Keyboard k = new Keyboard("Logitech", 35000);

		// getClass는 class타입을 반환 해줌
		Class c = k.getClass();
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
		System.out.println(c.getPackage().getName());
	}

}
