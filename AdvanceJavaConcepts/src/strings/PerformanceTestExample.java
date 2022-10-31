package strings;

public class PerformanceTestExample {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Java");
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			str1.append("Fundamentals");
		}

		System.out.println("Performance of String Buffer: " + (System.currentTimeMillis() - startTime));

		// String Builder is faster because it works in single threaded environment
		// with asynchronous operations.
		StringBuilder str2 = new StringBuilder("Java");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			str2.append("Fundamentals");
		}

		System.out.println("Performance of String Builder: " + (System.currentTimeMillis() - startTime));
	}
}
