package ch06.Ex_3;

public class Person {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

//	void show() {
//		System.out.println("사람[이름: " + name + ", 나이 : " + age);
//	}
	public String show() {
		return String.format("사람[이름: %s, 나이: %s ", name, age);
	}

}

class Student extends Person {
	private String number;

	public String getNumber() {
		return number;
	}

	// 생성자
	public Student(int age, String name, String number) {
		super(age, name);
		this.number = number;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return String.format("사람[이름: %s, 나이: %d, 학번: %s", super.getName(), super.getAge(), number);
	}

}

class ForeignStudent extends Student {
	private String where;

	public String getWhere() {
		return where;
	}

	public ForeignStudent(int age, String name, String number, String where) {
		super(age, name, number);
		this.where = where;

		// TODO Auto-generated constructor stub
	}

//
	@Override
	public String show() {
		// TODO Auto-generated method stub
		return String.format("사람[이름: %s, 나이: %d, 학번: %s", super.getName(), super.getAge(), super.getNumber(), where);
	}

}
