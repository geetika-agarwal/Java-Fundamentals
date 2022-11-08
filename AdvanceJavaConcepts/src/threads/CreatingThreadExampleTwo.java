package threads;

class SecondThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Second Thread Running");
		}
	}
}

public class CreatingThreadExampleTwo {
	public static void main(String[] args) {
		SecondThread thread = new SecondThread();
		thread.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("Main Thread Running");
		}
	}
}
