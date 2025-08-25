package ch09;

import java.util.ArrayList;

public class GenericInheritanceDemo {

	public static void main(String[] args) {
		ArrayList<Beverage> list1 = new ArrayList<>();

		list1.add(new Beverage());
		list1.add(new Beer());
		list1.add(new Boricha());

		beverageTest(list1);

		ArrayList<Beer> list2 = new ArrayList<>();
		list2.add(new Beer());
//		list2.add(new Boricha());
//		list2.add(new Beverage());

//		beverageTest(list2); //타입 불일치 ArrayList는 별도의 객체이므로 상속관계 해당안됨 
	}

	public static void beverageTest(ArrayList<Beverage> list) {
		System.out.println(list);

	}
}
