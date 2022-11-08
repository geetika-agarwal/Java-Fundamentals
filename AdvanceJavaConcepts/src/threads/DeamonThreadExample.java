package threads;

class DeamonThread implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Starting Deamon Thread...");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Daemon Thread ended.....");
	}
}

public class DeamonThreadExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		Thread childThread = new Thread() {
			@Override
			public void run() {
				System.out.println("Child thread running");
			};
		};

		// Gives error when we try to make the main thread as Daemon.
		// mainThread.setDeamon(true);
		childThread.setDaemon(true);

		System.out.println(mainThread.isDaemon());
		System.out.println(childThread.isDaemon());

		DeamonThread thread = new DeamonThread();
		Thread t1 = new Thread(thread);
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());

	}
}
