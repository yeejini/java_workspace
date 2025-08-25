package ch09;

public class GenericMethod2 {

	public static void main(String[] args) {
//		int[] iArr = {1,2,3,4,5};  배열 선언 시 Wrapper Class 헤야함
//		showArray(iArr);
		Integer[] iArr = { 1, 2, 3, 4, 5 };
		showArray(iArr);

		Double[] dArr = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		showArray(dArr);

		Character[] cArr = { 'a', 'b', 'c' };
//		showArray(cArr); Number을 상속받은 wrapper class가 아니기 때문에 안된다

	}

	// 슛자만 상속받은 제약을 걸고 싶을 때
	public static <T extends Number> void showArray(T[] arr) {
		for (T t : arr) {
			System.out.println(t);
		}
	}
}
