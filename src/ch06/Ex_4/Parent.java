package ch06.Ex_4;

public class Parent {
	String name = "영조";

	void print() {
		System.out.println("나는" + name);
	}
}

class Child extends Parent {
	String name = "사도세자";

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("나는" + name);
	}
}