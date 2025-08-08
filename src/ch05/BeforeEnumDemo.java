package ch05;

public class BeforeEnumDemo {

	public static void main(String[] args) {

		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);

	}

}

class People {
	int age;
	// 젠더 타입의 gender를 사용
	Gender gender;

}

enum Gender {
	// 상수 값
	// 상수 값을 생성할 때, 객체 생성이 됨
	MALE("남성"), FEMALE("여성");

	// 필드
	String gender;

	// 생성자
	// MALE이라는 매개변수가 존재하는 생성자를 생성하려면 위의 MALE객체에 매개변수를 부여해줘야함
	// 안그러면 JVM은 기본생성자가 없다고 판단하여 오류
	Gender(String gender) {
		// 받아온 매개변수를 전달받아서 초기화
		this.gender = gender;
	}

	// 메서드
	// gender를 반환하도록 오버라이딩
	@Override
	public String toString() {
		return gender;
	}
}

enum Num {
	ONE, TWO
}