package ch10;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> c1 = x -> System.out.println(x.toLowerCase());
		c1.accept("Hello Java");

		BiConsumer<String, String> bc = (x, y) -> System.out.println(x + ":" + y);
//		bc.accept("Hello", "Java");

		ObjIntConsumer<String> oc = (s, i) -> {
			System.out.println(s + ":" + i);
		};
		oc.accept("hello", 3);
	}

}
