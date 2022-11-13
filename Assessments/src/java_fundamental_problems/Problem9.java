package java_fundamental_problems;

/*
 * 9.	Write a Java application that uses looping to print the following table of values:
        N    10*N    	100*N 	 1000*N
       	1     10         100      1000
        2     20         200      2000
		3     30         300      3000
		4     40         400      4000
		5	  50         500      5000
* */

public class Problem9 {
	public static void main(String[] args) {
		System.out.println("N\tN*10\tN*100\tN*1000");
		for (int i = 1; i < 6; i++) {
			System.out.println(i + "\t" + i * 10 + "\t" + i * 100 + "\t" + i * 1000);
		}
	}
}
