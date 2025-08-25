package ch11;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		System.out.println(stack.size()); // 0 -> empty
		System.out.println(stack.empty());

		stack.push("사과");
		stack.push("바나나");
		stack.push("체리");
		System.out.println(stack.search("체리"));
		System.out.println(stack.search("사과")); // 마지막에 추가된 원소의 index는 1부터 시작

		while (!stack.empty()) {
			System.out.println(stack.pop()); // 맨위(최상위) 값을 꺼내서 반환
		}

		Stack<Integer> s2 = new Stack<>();

		s2.add(10);
		s2.add(20);
		s2.add(0, 100); // stack 규칙에 어긋남 -> 논리적으로 맞지 않기에, push pop사용

		while (!s2.empty()) {
			System.out.println(s2.pop()); // 맨위(최상위) 값을 꺼내서 반환
		}

	}

}
