package exceptions;

import java.util.Scanner;

// The Scanner class will automatically close whenever
// we try to write the Scanner object in the try 
// parameters. Catch will be called if there is any 
// error in instantiating the Scanner Object.

public class ScannerUsingExceptions {
	public static void main(String[] args) {
		String message;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter message: ");
			message = sc.nextLine();
			System.out.println("Message: " + message);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
