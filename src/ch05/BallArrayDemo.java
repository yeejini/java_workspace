package ch05;

public class BallArrayDemo {

	public static void main(String[] args) {
		Ball[] arr = new Ball[5];
		arr[0] = new Ball("빨강"); // 주소값
		arr[1] = new Ball("노랑");
		for (Ball ball : arr) {
			System.out.println(ball);
		}
	}

}

class Ball {
	String color;

	public Ball(String color) {
		this.color = color;
	}

//
//	// Object 객체 중 toString 오버라이드(다형성)
	@Override
	public String toString() {
		return color;
	}

}