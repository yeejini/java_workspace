package ch02;

public class StringDemo {

	public static void main(String[] args) {
//		char c = '' 빈 문자는 불가
		String s = ""; // 빈 문자열은 허용
		String res = "\t" + 7 + 7; // 문자열 "77" \만나면 그 뒤는 문자열로 취급(이스케이프)
		String res1 = 7 + 7 + ""; // 뭄자열 "14"

		System.out.println(res);
		System.out.println(res1);
	}

}
