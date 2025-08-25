package ch13;

public class ThreadDemo4 {
//스레드의 우선순위가 없음
	public static void main(String[] args) {
		// Thread 익명 객체를 작성하고 이를 활용
		new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " Thread ==> "); // 현재 돌고 있는 스레드의 이름 출력
				System.out.println("안녕");
			}
		}.start();
//		thread.start(); 와 동일 

		System.out.println(Thread.currentThread().getName() + " Thread ==> "); // 현재 돌고 있는 스레드의 이름 출력
		System.out.println("hello");

	}

}
