package ch04.sec07;

public class UtilDemo {

	public static void main(String[] args) {
		int res = Util.fourTimes(4);
		System.out.println(res);
	}

}

class Util {
	// 메소드
	static int fourTimes(int i) {
		return 4 * i;
	}

	// 생성자 (객체 생성 못하도록)
	private Util() {

	}
}