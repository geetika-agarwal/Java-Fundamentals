package sample;

public class ShiftOperator {
	public static void main(String[] args) {
		int num = 2;
		int result = num << 2;
		System.out.println(result);  // 8
		
		num = 4;
		result = num >> 2;
		System.out.println(result); // 1
		
		num = 100;
		result = num >>> 5;
		System.out.println(result);
	}
}
