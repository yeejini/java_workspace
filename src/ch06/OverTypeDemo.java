package ch06;

public class OverTypeDemo {

	public static void main(String[] args) {
		Vehicle v = new Car1();
		System.out.println(v.name); // 필드는 오버라이딩 대상이 아님
		v.whoamI(); // 메서드는 오버라이딩 대상이므로 자식의 기능이 실행됨
		Vehicle.move();
		v.move();

		Car1 car1 = new Car1();
		System.out.println(car1.name);
		car1.whoamI();
		Car1.move();
		car1.move();

		v = new SportCar();
		v.whoamI();

		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Car1();
		vehicles[1] = new SportCar();

		for (Vehicle vehicle : vehicles) {
			vehicle.whoamI();
			vehicle.move(); // static 이므로 오버라이딩 대상이 아니라 기존의 move인 이동하다가 출력
		}
	}

}
