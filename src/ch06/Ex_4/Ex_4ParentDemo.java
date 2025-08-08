package ch06.Ex_4;

public class Ex_4ParentDemo {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.name); // 필드 오버라이딩 불가
		p.print(); // 메서드 오버라이딩
	}
}
