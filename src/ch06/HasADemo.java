package ch06;

public class HasADemo {

	public static void main(String[] args) {
		Engine e = new Engine();
		Engine e2 = new Engine();

//		Car c = new Car(e); //생성할 때 엔진 끼워 생성
//		c.setEngine(e2); // 나중에 엔진 교페하는 개념

		Car c = new Car(); // 일체형, 교체 불가 => 불변 객체

//		c.engine =e;
	}

}

class Engine {

}

class Car {
	private Engine engine; // 은닉

	// 생성자 주입 ==> 생성 시에 부품을 주입시킴
	public Car() {
		this.engine = new Engine(); // Car가 만들어질 때 같이 만들어지고 일체형
	}

	// 은닉시킨 것은 getter, setter 필요
	public Engine getEngine() {
		return engine;
	}

//	//설정자 (setter) ==> 생성한 후 주입 ==> 설정자 주입
//	public void setEngine(Engine engine	) {
//		this.engine = engine;
//	}
}
