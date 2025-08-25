package ch11;

import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		String[] animal = { "사슴", "호랑이", "바다표범", "곰" }; // add와 remove x, 해당 index의 요소를 수정가능
		List<String> animal2 = Arrays.asList(animal); // add와 remove x, set o

		// 컴파일 오류는 뜨지 않지만,Exception 발생
//		animal2.add("앵무새");  Collection이 add()
//		animal2.add(1, "앵무새"); List의 add()

		animal2.set(0, "앵무새");
//		순차적으로 찍는 것 = Iterator
		for (int i = 0; i < animal2.size(); i++) {
			// List는 가져올때, get을 제공
			System.out.println(animal2.get(i));
		}
		// comparator의 람다식만 만들어주면됨
		animal2.sort((o1, o2) -> o1.length() - o2.length());

		for (int i = 0; i < animal2.size(); i++) {
			// List는 가져올때, get을 제공
			System.out.println(animal2.get(i));
		}

		List<Integer> numbers = List.of(1, 2, 3, 4, 5); // immutable => add, remove, set안됨
//		numbers.sort((o1, o2) -> o1 - o2); //순서를 바꾸는 것도 안됨
//		numbers.set(0, 10); 안됨
//		numbers.add(10);

	}

}
