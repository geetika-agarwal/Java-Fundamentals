package java_oops_problems;

/*4.	Create a class SavingsAccount. 
 * Use a static variable annualInterestRate to store the annual interest rate for all account holders. 
 * Each object of the class contains a private instance variable savingsBalance indicating the amount 
 * the saver currently has on deposit. 
 * Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the 
 * savingsBalance by annualInterestRate divided by 12 this interest should be added to savingsBalance.
 * Provide a static method modifyInterestRate that sets the annualInterestRate to a new value. 
 * Write a program to evaluate the class SavingsAccount. 
 * Instantiate two savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. 
 * Set annualInterestRate to 4%, then calculate the monthly interest and print the new balances 
 * for both savers. Then set the annualInterestRate to 5%, calculate the next month’s interest 
 * and print the new balances for both savers.*/

class SavingsAccount {
	private static double annualInterestRate = 0.04;
	private double savingsBalance;

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void calculateMonthlyInterest() {
		savingsBalance = savingsBalance + (savingsBalance * annualInterestRate) / 12;
	}
}

public class Problem4 {
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(20000.00);
		SavingsAccount saver2 = new SavingsAccount(30000.00);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("The saving balance for Saver 1 after 1 month with " + saver1.getAnnualInterestRate()
				+ " interest rate is: " + saver1.getSavingsBalance());
		System.out.println("The saving balance for Saver 2 after 1 month with " + saver2.getAnnualInterestRate()
				+ " interest rate is: " + saver2.getSavingsBalance());

		SavingsAccount.setAnnualInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.println("The saving balance for Saver 1 after 2 months with " + saver1.getAnnualInterestRate()
				+ " interest rate is: " + saver1.getSavingsBalance());
		System.out.println("The saving balance for Saver 2 after 2 months with " + saver2.getAnnualInterestRate()
				+ " interest rate is: " + saver2.getSavingsBalance());
	}
}
