package ch07.sec03;

public class CoinDemo {

	public static void main(String[] args) {
		System.out.println("Dime은 " + Coin.DIME + " 센트 입니다.");
	}

}

interface Coin {
	int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25; // public static final 생략됨

}