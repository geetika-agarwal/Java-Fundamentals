package java_fundamental_problems;

import java.util.Scanner;

/*10.	Write a complete Java application to prompt the user for the double radius of a sphere, 
 * and call method sphere Volume to calculate and display the volume of the sphere. 
 * Use the following statement to calculate the volume:  
 * double volume = (4.0 / 3.0) * Math.PI * Math.pow( radius, 3 )
 */

public class Problem10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of the Sphere...");
		double r = sc.nextDouble();
		double vol = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
		System.out.printf("Volume of the Sphere is: %.2f", vol);
	}
}
