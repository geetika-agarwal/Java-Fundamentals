package java_fundamental_problems;

import java.util.Scanner;

/*12.	Write a Java program that reads a string from the keyboard, 
 * and outputs the string twice in a row, first all uppercase and next all lowercase. 
 * If, for instance, the string “Hello" is given, the output will be “HELLOhello".*/

public class Problem12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println(str.toLowerCase() + str.toUpperCase());
	}
}
