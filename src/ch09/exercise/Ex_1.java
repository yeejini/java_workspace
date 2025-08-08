package ch09.exercise;

public class Ex_1 {

	public static void main(String[] args) {
		Box<Integer> i = new Box<>();
		i.set(Integer.valueOf(100));
		System.out.println(i.get());

		Box<String> s = new Box<>();
		s.set("만능이네!");
		System.out.println(s.get());
	}

}

class Box<T> {
	private T t;

	public Box() {
	}

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}