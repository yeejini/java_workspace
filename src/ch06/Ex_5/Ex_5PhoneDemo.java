package ch06.Ex_5;

public class Ex_5PhoneDemo {

	public static void main(String[] args) {
		Phone[] phone = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };

		for (int i = 0; i < 3; i++) {
			if (phone[i] instanceof Smartphone) {
				Smartphone s = (Smartphone) phone[i];
				s.playGame();
			} else if (phone[i] instanceof Telephone) {
				Telephone t = (Telephone) phone[i];
				t.autoAnswering();
			} else if (phone[i] instanceof Phone) {
				Phone p = phone[i];
				p.talk();
			}
		}

	}
}

class Phone {
	protected String owner;

	public void talk() {
		System.out.println(owner + " 가 통화중");
	}

	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
}

class Telephone extends Phone {
	private String when;

	public String getWhen() {
		return when;
	}

	public void autoAnswering() {
		System.out.println(owner + " 가 부재중이니, " + when + " 에 전화 요망");
	}

	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
}

class Smartphone extends Telephone {
	private String game;

	public String getGame() {
		return game;
	}

	public void playGame() {
		System.out.println(owner + " 가" + game + " 중");
	}

	public Smartphone(String owner, String game) {
		super(owner, game);
		this.game = game;
	}
}