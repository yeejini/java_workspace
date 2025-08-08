package ch07;

import ch07.sec03.Computer;
import ch07.sec03.Controllable;
import ch07.sec03.Tv;

public class ControllableDemo2 {

	public static void main(String[] args) {
		Controllable[] controllables = { new Tv(), new Computer() };
		for (Controllable controllable : controllables) {
			controllable.turnOn();
			controllable.turnOff();
			controllable.repair();
		}
	}

}
