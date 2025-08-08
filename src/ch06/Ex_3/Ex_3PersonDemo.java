package ch06.Ex_3;

public class Ex_3PersonDemo {

	public static void main(String[] args) {

		Person[] person = { new Person(22, "길동이"), new Student(23, "황진이", "100"),
				new ForeignStudent(30, "Amy", "200", "U.S.A") };
		for (Person persons : person) {
			System.out.println(persons.show());
		}
	}

}
