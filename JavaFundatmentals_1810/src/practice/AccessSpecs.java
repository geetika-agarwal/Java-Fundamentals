package practice;

import java.util.Scanner;

public class AccessSpecs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select your role:");
		System.out.println("1. Admin");
		System.out.println("2. Sub Admin");
		System.out.println("3. Test Prep");
		System.out.println("4. User");
		
		System.out.println("\n Enter your role");
		int role = sc.nextInt();
		
		switch(role) {
		case 1: 
			System.out.println("Get Full Access");
			break;
		case 2:
			System.out.println("Get Access to Create or Delete the courses");
			break;
		case 3:
			System.out.println("Get Access to Create or Delete the tests");
			break;
		case 4:
			System.out.println("Get Access to Consume the Content");
			break;
		default:
			System.out.println("Selected a wrong option");
		}
		
		sc.close();
	}
}
