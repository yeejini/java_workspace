package ch10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CarDemo {

	public static void main(String[] args) {
//		List<Car> list = Car.cars;
//		for (Car car : list) {
//			System.out.println(car);
//		}

		List<Car> list = Car.cars.subList(0, 3);
		System.out.println(list.size());
		Car[] cars = list.toArray(new Car[3]);

		Arrays.sort(cars);
		System.out.println(Arrays.toString(cars));

		// Model을 기준으로 comparing
		Comparator<Car> modelComparator = Comparator.comparing(c -> c.getModel());

		Arrays.sort(cars, modelComparator);
		System.out.println(Arrays.toString(cars));

		Arrays.sort(cars, modelComparator.reversed());
		System.out.println(Arrays.toString(cars));

		// Mileage를 기준으로 comparing
//		Comparator<Car> MileageComparator = Comparator.comparing(c -> c.getMileage());
		Comparator<Car> MileageComparator = Comparator.comparing(Car::getMileage);

		Arrays.sort(cars, MileageComparator);
		System.out.println(Arrays.toString(cars));

		// Age를 기준으로 comparing
//		Comparator<Car> AgeComparator = Comparator.comparing(c -> c.getAge());
		Comparator<Car> AgeComparator = Comparator.comparing(Car::getAge); // 메소드 참조

		Arrays.sort(cars, AgeComparator);
		System.out.println(Arrays.toString(cars));

		Arrays.sort(cars, AgeComparator.reversed());
		System.out.println(Arrays.toString(cars));
	}

}
