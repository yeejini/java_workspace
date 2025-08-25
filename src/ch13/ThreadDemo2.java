package ch13;

public class ThreadDemo2 {

	public static void main(String[] args) {
		// Runnable 인터페이스 구현체를 따로 작성하고 이를 활용
		Thread thread = new Thread(new MyRunnable());
//		thread.start(); // 별도의 스레드 영역에서 실행
		thread.run(); // 메인안에서 실행되므로 메인이라는 스레드 안에서

		Thread thread1 = new Thread(new MyRunnable());
		thread1.start(); // 실행

		System.out.println(Thread.currentThread().getName() + " Thread ==> "); // 현재 돌고 있는 스레드의 이름 출력
		System.out.println("hello");

	}

}

//작업할 내용 
class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Thread ==> ");
		System.out.println("안녕");

	}

}