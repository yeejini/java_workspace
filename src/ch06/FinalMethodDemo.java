package ch06;

public class FinalMethodDemo {

	public static void main(String[] args) {
		WorldChess wc = new WorldChess();
		System.out.println(wc.getFirstPlayer());
	}

}

class Chess {
	enum ChessPlayer {
		BLACK, WHITE;
	}

	// 첫번째 선수 WHITE
	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WHITE;
	}
}

class WorldChess extends Chess {
//	@Override
//	ChessPlayer getFirstPlayer() {
//		return ChessPlayer.BLACK; //블랙이 먼저 오도록 오버라이드 못하도록 해야함 -> final 설정
//	}
}