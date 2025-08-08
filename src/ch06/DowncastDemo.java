package ch06;

public class DowncastDemo {

	public static void main(String[] args) {
//	Class casting exception	
//		Person p = new Person();

//		Student s = (Student) p; //조상 타입을 자손으로 강제 변환할 수 없다

		Person[] pArr = new Person[5];
		pArr[0] = new Student(); // 공부한다
		pArr[1] = new Employee(); // 일한다
		pArr[2] = new SportPlayer(); // 운동한다
		pArr[3] = new Entertainer(); // 노래한다
		pArr[4] = new Person();

		for (Person person : pArr) {
//			person.whoAmI();
			person.work(); // 자식이 가지고 있는 것을 실행하고 싶으면 자손의 타입으로 형변환해야한다
			downcast(person);

		}
	}

	// downcast 실행 함수
	public static void downcast(Person person) {
		person.work();

	}

}
