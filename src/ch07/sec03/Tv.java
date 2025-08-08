package ch07.sec03;

public class Tv implements Controllable, RemoteControllable {

	@Override
	public void turnOn() {
		System.out.println("tv를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끈다.");
	}

	@Override
	public void remoteOn() {
		System.out.println("리모트콘으로 tv를 켠다.");
	}

	@Override
	public void remoteOff() {
		System.out.println("리모트콘으로 tv를 끈다.");
	}

}
