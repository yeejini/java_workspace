package ch03;

public class NestedIfDemo {

	public static void main(String[] args) {
		// nested if
//		String str ; //str=null; -> 이러면 참조할 때 오류 발생
//		String str = null; // (갈 곳이 없음)아무 값이 없음이 할당이 됨 

		String str = null; // -> 빈 곳에 가서 찍음 //0

		System.out.println(str);
//		System.out.println(str.length()); 

//		if (str != null) { //null check
//			if (str.length() == 0) {
//				System.out.println("빈 문자열 입니다.");
//			} else {
//				System.out.println(str.length() + " 글자의 문자열 입니다.");
//			}
//
//		}
		// 쇼트서킷
		if (str != null && str.length() > 0) {
			System.out.println(str.length() + "글자의 문자열입니다.");

		} else {
			System.out.println("빈 문자열입니다");
		}

	}

}
