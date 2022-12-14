package practice;

import java.util.Scanner;

public class TaxCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter income");
		int income = sc.nextInt();
		
		float tax, tax_percent = 0;
		
		if(age < 60) {
			if(income <= 250000)
				tax_percent = 0;
			else if(income >= 250001 && income <= 500000)
				tax_percent = 0.1F;
			else if(income >= 500001 && income <= 1000000)
				tax_percent = 0.2F;
			else
				tax_percent = 0.3F;
		}
		else if(age >= 60 && age <80) {
			if(income < 300000) 
				tax_percent = 0;
			else if(income >= 300001 && income <= 500000)
				tax_percent = 0.1F;
			else if(income >= 500001 && income >= 1000000)
				tax_percent = 0.2F;
			else
				tax_percent = 0.3F;
		} else {
			if(income <= 500000) 
				tax_percent = 0;
			else if(income >= 500001 && income <= 1000000)
				tax_percent = 0.2F;
			else
				tax_percent = 0.3F;
		}
		
		tax = income * tax_percent;
		System.out.println(tax);
		
		sc.close();
	}
}
