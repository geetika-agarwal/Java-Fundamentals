package generics;

class MyClass {
	public <T> void printArray(T[] arr) {
		for (T val : arr) {
			System.out.println(val);
		}
	}
}

public class GenericMethodClass {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		Integer[] arr = { 10, 20, 30, 40 };
		obj.printArray(arr);
	}
}
