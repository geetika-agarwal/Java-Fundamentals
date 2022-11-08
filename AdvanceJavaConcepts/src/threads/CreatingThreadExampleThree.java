package threads;

class ThirdThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Third Thread Running....");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class CreatingThreadExampleThree {
	public static void main(String[] args) throws InterruptedException {
		ThirdThread thread = new ThirdThread();

		thread.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("Main Thread Running");
			Thread.sleep(100);
		}
	}
}
