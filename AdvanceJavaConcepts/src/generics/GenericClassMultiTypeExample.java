package generics;

class Calculation<T, U> {
	T value1;
	U value2;

	public Calculation(T val1, U val2) {
		this.value1 = val1;
		this.value2 = val2;
	}

	public void display() {
		System.out.println("Value 1: " + value1);
		System.out.println("Value 2: " + value2);
	}
}

public class GenericClassMultiTypeExample {
	public static void main(String[] args) {
		Calculation<Integer, Integer> calc = new Calculation<Integer, Integer>(10, 20);
		calc.display();
	}
}
