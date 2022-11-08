package threads;

class FirstThread extends Thread {
	@Override
	public void run() {
		System.out.println("First Thread Running");
	}
}

public class CreatingThreadExampleOne {
	public static void main(String[] args) {
		FirstThread thread = new FirstThread();

		// Makes the thread into a runnable state. Can be called only once unless it is
		// resumed or interrupted.
		thread.start();

	}
}
