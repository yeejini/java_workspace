package ch04;

public class PersonDemo {

	public static void main(String[] args) {
		Person p = new Person();
//		p.setAge(22);
//		p.setName("민국");
//		p.setNationality("대한민국");
//		p.sayHello();

		p.setAge(22).setName("민국").setNationality("대한민국").sayHello();
	}

}

class Person {
	private String name;
	private int age;
	private String nationality;

	// 자기자신을 체인으로 호출하고 싶은 경우
	// Person이라는 데이터타입을 가진 this를 반환
	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public Person setNationality(String nationality) {
		this.nationality = nationality;
		return this;
	}

	public void sayHello() {
		System.out.println(nationality + " 에 사는 " + age + " 살" + name);
	}
}