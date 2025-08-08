package ch06.Ex_6;

public class Ex_6VehicleDemo {

	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();

		System.out.println();
		Vehicle v = c; // upcasting해서 부모 것고 자식 것 동일
		v.show();
	}

}

class Vehicle {
	String color;
	int speed;

	// 생성자
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	void show() {
		System.out.println("Vehicle의 필드 값: ");
		System.out.println(color);
		System.out.println(speed);
	}
}

class Car extends Vehicle {
	int displacement;
	int gears;

	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}

	@Override
	void show() {
		System.out.println("Car의 필드 값: ");
		System.out.println(color);
		System.out.println(speed);
		System.out.println(displacement);
		System.out.println(gears);
	}
}