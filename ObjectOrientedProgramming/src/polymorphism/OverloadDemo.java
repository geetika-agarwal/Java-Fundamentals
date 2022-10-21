package polymorphism;

// Simple example of Method Overloading.

class TestClass {

	void test() {
		System.out.println("No Parameters");
	}

	void test(int a, int b) {
		System.out.println("a = " + a + ", b = " + b);
	}

	void test(double a) {
		System.out.println("Inside double test: " + a);
	}

}

public class OverloadDemo {
	public static void main(String[] args) {
		TestClass obj = new TestClass();
		obj.test();
		obj.test(4, 6);
		obj.test(27.4);
	}
}
