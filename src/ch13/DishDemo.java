package ch13;

public class DishDemo {

	public static void main(String[] args) {
		// 공유자원인 dish만듬
		Dish dish = new Dish();

		new Thread(new Cook(dish)).start();
		new Thread(new Customer(dish)).start();
	}

}

//dish를 공유
class Dish {
	private boolean empty = true; // 빈접시

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

}

class Cook implements Runnable {
	private final Dish dish; // 생성할 때 만들어진 객체를 끝날 때까지 바꾸지 않겠다.

	public Cook(Dish dish) {
		this.dish = dish;
	}

	// 요리
	private void cook(int i) throws InterruptedException {
		synchronized (dish) {
			// 음식을 먹는동안 기다리는 중
			while (!dish.isEmpty()) {
				// wait길어지면 iterrupt 들어올 수도 있기 대문에 throws필요
				dish.wait();
			}
			// 음식 다 먹은 후
			dish.setEmpty(false); // 음식 준비 다됨
			System.out.println(i + " 번 째 음식이 준비되었습니다.");
			dish.notify();
		}

	}

	@Override
	public void run() {
		// 요리를 5번 할 것임
		for (int i = 0; i < 5; i++) {

			try {
				cook(i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

class Customer implements Runnable {
	private final Dish dish;

	public Customer(Dish dish) {
		this.dish = dish;
	}

	// 요리
	private void eat(int i) throws InterruptedException {
		synchronized (dish) {
			// 음식을 먹는동안 기다리는 중
			while (!dish.isEmpty()) {
				// wait길어지면 iterrupt 들어올 수도 있기 대문에 throws필요
				dish.wait();
			}
			// 음식 다 먹은 후
			dish.setEmpty(true); // 음식 준비 다됨
			System.out.println(i + " 번 째 음식을 먹었습니다.");
			dish.notify();
		}

	}

	@Override
	public void run() {
		// 요리를 5번 할 것임
		for (int i = 0; i < 5; i++) {

			try {
				eat(i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}