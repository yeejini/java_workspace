package ch07.sec03;

public class Computer implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("computer를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("computer를 끈다.");
	}

}

class Notebook extends Computer implements Portable {

	@Override
	public void inMyBag() {
		System.out.println("노트북은 가방 안에 있다.");
	}

	@Override
	public void turnOn() {
		System.out.println("노트북을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끈다.");

	}
}