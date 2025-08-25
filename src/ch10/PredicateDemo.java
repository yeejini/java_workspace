package ch10;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		IntPredicate even = x -> x % 2 == 0;
		System.out.println(even.test(3) ? "짝수" : "홀수");

		BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
		System.out.println(bp.test(3, 5) ? "앞ㅇ 숫자가 더 크다" : "뒤에 숫자가 더 크다");

		Predicate<String> p = x -> x.equals("");
		System.out.println(p.test("hello") ? "빈 문자열입니다" : "빈문자열이 아닙니다");
	}

}
