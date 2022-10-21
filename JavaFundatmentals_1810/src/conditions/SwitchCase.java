package conditions;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		System.out.println("Select an option below:");
		System.out.println("1. Deposit");
		System.out.println("2. Withdrawal");
		System.out.println("3. Balance");
		
		System.out.println("\nEnter Choice:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("Amount Deposited");
			break;
		case 2:
			System.out.println("Amount Withdrwal completed");
			break;
		case 3:
			System.out.println("Current Balance is xxxxx");
			break;
		default:
			System.out.println("Incorrect Option Selected");
		}
		
		sc.close();
	}
	
}
