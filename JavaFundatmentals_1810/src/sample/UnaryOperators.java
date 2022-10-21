package sample;

public class UnaryOperators {
	public static void main(String[] args) {
		int num = 100;
		int result;
		// Increment
		result = num++;
		System.out.println(result); // 100
		System.out.println(num); // 101
		result = ++num;
		System.out.println(result); // 102
		System.out.println(num); // 102
		
		// Decrement
		result = num--;
		System.out.println(result); // 102
		System.out.println(num); // 101
		result = --num;
		System.out.println(result); // 100
		System.out.println(num); // 100
	}
}
