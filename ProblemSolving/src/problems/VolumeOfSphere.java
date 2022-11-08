package problems;

import java.util.Scanner;

public class VolumeOfSphere {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius of the sphere");

		double r = sc.nextDouble();

		double volume = (3.0 / 4.0) * Math.PI * Math.pow(r, 3);

		System.out.printf("Volume of Sphere: %.2f", volume);
	}
}
