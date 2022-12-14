package sample;

public class BitwiseOperator {

	public static void main(String[] args) {
		int num1 = 12, num2 = 25;
		
		// Bitwise OR
		int result = num1 | num2;
		System.out.println(result);
		
		// Note:
		// 12 =   00001100
		// 25 =   00011001
		//12|25 = 00011101 = 29
		
		//Bitwise AND
		result = num1 & num2;
		System.out.println(result);
		
		//Bitwise XOR
		result = num1 ^ num2;
		System.out.println(result);
		
		// Bitwise Compliment
		int num3 = 24;
		result = ~num3;
		System.out.println(result);
	}

}
