package threads;

class MyClass {
	public static void name() {
		System.out.println("This is a name method");
	}
}

class RunnableClass extends MyClass implements Runnable {
	@Override
	public void run() {
		System.out.println("The thread is running....");
	}
}

public class ThreadingUsingRunnableBenefitExample {
	public static void main(String[] args) {
		RunnableClass thread = new RunnableClass();

		Thread t1 = new Thread(thread);
		t1.start();
	}
}
