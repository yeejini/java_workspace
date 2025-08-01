package ch04.sec07;

public class StaticBlockDemo {
	// 정적 변수
	static int sumOneToTen;
	static {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		sumOneToTen = sum;
	}
	int any = 0;

	// 정적 메소드
	public static void main(String[] args) {
		System.out.println(sumOneToTen);
//		System.out.println(any); //클래스 메소드 안에서 인스턴스 변수 사용 못함
//		System.out.println(sum); //클래스 메소드 안에서 지역 변수 사용 못함
	}

}

class StaticBlock {

}