package threads;

class ThreadA extends Thread {
	@Override
	public void run() {
		System.out.println("Thread A started...");
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread A: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread A ended....");
	}
}

class ThreadB extends Thread {
	@Override
	public void run() {
		System.out.println("Thread B started...");
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread B: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread B ended....");
	}
}

public class ThreadLifeCycle {
	public static void main(String[] args) {
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();

		System.out.println("Main Thread started....");

		Thread.currentThread().setPriority(10);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();

		t1.yield();

		try {
			t1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t2.start();

		System.out.println("Main Thread completed....");
	}
}
