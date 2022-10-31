package collections;

public class ArrayClassExample {
	public static void main(String[] args) {
		int number[] = { 10, 20, 30, 40, 50 }; // Array Initialization

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}

		System.out.println("---------------------");

		for (int num : number) {
			System.out.println(num);
		}
	}
}
