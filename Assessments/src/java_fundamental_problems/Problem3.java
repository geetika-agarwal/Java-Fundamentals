package java_fundamental_problems;

/*
 * 3.	Write an application that displays the numbers 1 to 4 on the same line, 
 * with each pair of adjacent numbers:
a.	separated by one space. Write the application using the following techniques:  
b.	Use one System.out.println statement.  
c.	Use four System.out.print statements.  
d.	Use one System. out. printf statement

 * */

public class Problem3 {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3, d = 4;
		System.out.println(a + "" + b + " " + c + "" + d);

		System.out.println("----------------------------------");

		System.out.print(a + "");
		System.out.print(b + " ");
		System.out.print(c + "");
		System.out.print(d + "\n");

		System.out.println("---------------------------------------");

		System.out.printf("%d%d %d%d", a, b, c, d);
	}
}
