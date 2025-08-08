package ch07;

public class MovableDemo {

	public static void main(String[] args) {
		Movable m = new Car(); // 자동 형변환(upcasting)

		m.move(5);
//		m.show(); //보이지 않음

		Car c = (Car) m; // 강제 형변환(downcasting) -> 자식의 show를 사용하기 위해
		c.move(5);
		c.show();
	}

}

//Movable 인터페이스를 가지는 클래스들은 move를 필수로 가짐
interface Movable {
	void move(int s);
}

class Car implements Movable {
	private int pos = 0; // 포지션을 0으로 초기화

	@Override
	public void move(int x) {
		pos += x; // x만큼 포지션 이동
	}

	public void show() {
		// 포지션만큼 이동한 것 출력
		System.out.println(pos + "m 만큼 이동했습니다.");
	}

}