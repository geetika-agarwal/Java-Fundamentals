package threads;

class MyThread implements Runnable {
	@Override
	public void run() {

		System.out.println("My Thread is Running...");
	}
}

public class ThreadsWithRunnableInterface {
	public static void main(String[] args) {
		MyThread thread = new MyThread();

		thread.run();
//		Thread t1 = new Thread(thread);
//		t1.run();
	}
}
