/* Problem Statement 2:

Write a program perform the addition of numbers using two parameters and three parameters then we can write two separate addition methods with the same name but with different number of parameters.

 *************************************************************** */

package assignments;

class Addition {
	public static void add(int a, int b) {
		System.out.println("The sum of two numbers: " + (a + b));
	}

	public static void add(int a, int b, int c) {
		System.out.println("The sum of three numbers: " + (a + b + c));
	}
}

public class ProblemStatement2 {
	public static void main(String[] args) {
		Addition.add(20, 35);
		Addition.add(10, 20, 40);
	}
}
