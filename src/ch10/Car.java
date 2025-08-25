package ch10;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Car implements Comparable<Car> {
	private String model;
	private boolean gasoline;
	private int age;
	private int mileage;

	// 생성자
	public Car(String model, boolean gasoline, int age, int mileage) {
		this.model = model;
		this.gasoline = gasoline;
		this.age = age;
		this.mileage = mileage;
	}

	// 접근자
	public String getModel() {
		return model;
	}

	public boolean isGasoline() {
		return gasoline;
	}

	public int getAge() {
		return age;
	}

	public int getMileage() {
		return mileage;
	}

	@Override
	public String toString() {
		return String.format("Car(%s, %s, %d, %d)", model, gasoline, age, mileage);
	}

	// 초기 값 설정
	public static final List<Car> cars = Arrays.asList(new Car("소나타", true, 18, 210000),
			new Car("코란도", false, 15, 200000), new Car("그랜저", true, 12, 150000), new Car("싼타페", false, 10, 220000),
			new Car("아반테", true, 10, 70000), new Car("에쿠스", true, 6, 100000), new Car("그랜저", true, 5, 80000),
			new Car("소나타", true, 2, 35000), new Car("쏘렌토", false, 1, 10000), new Car("아반테", true, 1, 7000));

	// comparable에 있는 것 필수 오버라이딩
	@Override
	public int compareTo(Car o) {
		return this.hashCode() - o.hashCode();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(model);
	}
}
