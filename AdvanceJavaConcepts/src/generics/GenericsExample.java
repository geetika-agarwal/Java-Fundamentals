package generics;

class Test<T> {
	T obj;

	Test() {
		super();
	}

	Test(T obj) {
		this.obj = obj;
	}

	public T getObject() {
		return this.obj;
	}
}

public class GenericsExample {
	public static void main(String[] args) {
		Test<Integer> test = new Test<Integer>(15);
		System.out.println("Test value: " + test.getObject());
	}
}
