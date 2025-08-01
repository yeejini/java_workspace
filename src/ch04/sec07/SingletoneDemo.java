package ch04.sec07;

public class SingletoneDemo {

	public static void main(String[] args) {
//		Singletone s = new Singletone(); //private이므로 객체 생성 불가

		// 주소값만 넘겨줌
		Singletone s1 = Singletone.getInstance();
		Singletone s2 = Singletone.getInstance();
		Singletone s3 = Singletone.getInstance();
		System.out.println(s1); // Object에 있는 toString()에 정의된 바에 의해서 이름 @111 가 출력ㅓ
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1 == s2 && s2 == s3);
	}

}

class Singletone {
//	static 변수
	private static Singletone singletone = new Singletone();

	// 생성자
	private Singletone() {

	}

	// static 메서드
	public static Singletone getInstance() {
		return singletone; // 참조 변수(주소값) 리턴

	}
}