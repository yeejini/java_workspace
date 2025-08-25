package ch10;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> s = () -> new String("hello");
		System.out.println(s.get());

	}

}
