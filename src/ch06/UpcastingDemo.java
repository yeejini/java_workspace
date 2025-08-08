package ch06;

public class UpcastingDemo {

	public static void main(String[] args) {
		Student s = new Student();

		// 자식 객체를 가리키는 주소를 부모 타입의 참조변수에 할당할 수 있는 것
		// upcasting
		// 자식의 객체 주소를 가리키고 있지만, 나의 것만 사용가능하고 자식 것은 사용 불가
		Person p = s; // 자동 형변환

		System.out.println(p.name);
		p.whoAmI();

		downcast(s);

		Employee e = new Employee();
		downcast(e);

		SportPlayer sp = new SportPlayer();
		downcast(sp);

		// 확장이 될때마다 추가는 하지만 기존 코드는 안바꿔도 된다
		Person[] pArr = new Person[4];
		pArr[0] = new Student();
		pArr[1] = new Employee();
		pArr[2] = new SportPlayer();
		pArr[3] = new Entertainer();

		for (Person person : pArr) {
			person.whoAmI();
		}

		// 확장이 될 때마다 고쳐야하는
//		Student[] sArr = new Student[3];
//		Employee[] eArr = new Employee[3];
//		SportPlayer[] spArr = new SportPlayer[3];

	}

	public static void downcast(Person p) {
		p.whoAmI();
	}
	// 자식이 늘어날 때 마다 생성해야하는 번거로움
//	public static void downcast(Student s) {
//		
//	}
//	
//	public static void downcast(Employee e) {
//		
//	}

}
