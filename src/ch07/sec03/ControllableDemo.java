package ch07.sec03;

public class ControllableDemo {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer computer = new Computer();

		tv.turnOn();
		tv.turnOff();

		tv.repair();

		computer.turnOn();
		computer.turnOff();

		tv.remoteOn();
		tv.remoteOff();

		Controllable.reset();

		Notebook nb = new Notebook();
		nb.inMyBag();
		nb.turnOn();
		nb.turnOff();

	}

}
