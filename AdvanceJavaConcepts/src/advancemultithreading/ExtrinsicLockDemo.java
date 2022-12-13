package advancemultithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ExtrinsicLock implements Runnable {

	private Lock lock;

	public ExtrinsicLock(Lock lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		System.out.println("Entered run method... trying to lock the monitor object for thread: ");
		lock.lock();
		try {
			System.out.println("Locked Monitor...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Releasing lock...");
			lock.unlock();
		}

		System.out.println("End of run method...");
	}
}

public class ExtrinsicLockDemo {
	public static void main(String[] args) {
		System.out.println("=========Explicit Lock Test=======");
		String[] myThreads = { "Therad ONE", "Thread TWO", "Thread THREE", "Thread FOUR" };
		Lock lock = new ReentrantLock(true);

		for (String threadName : myThreads) {
			new Thread(new ExtrinsicLock(lock), threadName).start();
		}
	}
}
