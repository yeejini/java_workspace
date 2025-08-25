package ch13;

public class ThreadDemo3 {
//스레드의 우선순위가 없음
	public static void main(String[] args) {
		// Runnable 인터페이스의 구현체(Thread)를 상속받은 WorkerThread 를 따로 작성하고 이를 활용
		Thread thread = new Thread(new WorkerThread());
		thread.start(); // 별도의 스레드 영역에서 실행
//		thread.run(); // 메인안에서 실행되므로 메인이라는 스레드 안에서

		Thread thread1 = new Thread(new WorkerThread());
		thread1.start(); // 실행

		System.out.println(Thread.currentThread().getName() + " Thread ==> "); // 현재 돌고 있는 스레드의 이름 출력
		System.out.println("hello");

	}

}

class WorkerThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Thread ==> "); // 현재 돌고 있는 스레드의 이름 출력
		System.out.println("안녕");
	}
}