package sample;

import java.util.Scanner;

public class breakStatements {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a number		");
			int num = sc.nextInt();
			if(num > 100)
				break;
			if(num % 5 == 0) 
				System.out.println("Number divisible by 5");
			else
			System.out.println("Number not divisible by 5");
		}
		
		sc.close();
	}
	
}
