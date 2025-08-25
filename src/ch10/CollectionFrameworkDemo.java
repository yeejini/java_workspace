package ch10;

import java.util.ArrayList;

public class CollectionFrameworkDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("");
		list.add("banana");
		list.add("cherry");

		list.forEach((s) -> System.out.println(s)); // Consumer 인터페이스의 구현체를 람다식으로 작성
		list.removeIf((s) -> s.length() == 0); // Predicate 인터페이스의 구현체를 람다식으로 작성
		list.forEach((s) -> System.out.println(s));

		// 숫자를 원소로 가지는 ArrayList를 작성해라. 그리고 원소를 4개 추가하는데, +-> 2개, - 2개
		// 리스트에서 음수값은 삭제하고 양수값만 남겨놓은 다음, 남아있는 원소들 전부 출력
		ArrayList<Integer> iArr = new ArrayList<>();
		iArr.add(3);
		iArr.add(15);
		iArr.add(-1);
		iArr.add(-20);

		iArr.forEach((i) -> System.out.println(i));
		iArr.removeIf((i) -> i < 0);
		System.out.println("양수 값 출력");
		iArr.forEach((i) -> System.out.println(i));

		// 객체(삼각형)을 원소로 가지는 ArrayList를 작성, 원소를 3개 추가하는데 밑변과 높이가 __ 인 객체이다
		// 삼각형 넓이가 20보다 작은 것은 리스트에서 삭제하고, 남아놓은 원소를 전부 출력
		ArrayList<Triangle> tArea = new ArrayList<>();
		tArea.add(new Triangle(10, 2));
		tArea.add(new Triangle(5, 2));
		tArea.add(new Triangle(8, 6));

		tArea.forEach((t) -> System.out.println(t));
		tArea.removeIf((t) -> t.Area() < 20);
		System.out.print("삼각형 넓이가 20보다 작은 것 출력:");
		tArea.forEach((t) -> System.out.println(t));

	}

}

class Triangle {
	int height;
	int width;

	public Triangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int Area() {
		return height * width / 2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Triangle Area= %d", Area());
	}

}
