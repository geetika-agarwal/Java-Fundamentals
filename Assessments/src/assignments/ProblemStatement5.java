/* Problem Statement 5: 

Define an interface IAccount and declared the methods getBalance, 
deposit and withdraw. Create two concrete classes named as HDFCAccount and StateBankAccount 
that implements IAccount interface. There is difference between implementation of these classes, 
HDFCAccount uses member variables deposits and withdrawals for maintaining the balance, where as 
StateBankAccount uses only balance to maintain the balance. Test your application with creating 
objects of HDFCAccount and StateBankAccount. Don't forget to assigned them to the reference of 
the interface IAccount. The methods transactOnAccount and printBalance only know about the 
interface IAccount and does not getting impacted on which class's object is passed. */

package assignments;

interface IAccount {
	double getBalance();

	void deposit(double amount);

	void withdraw(double amount);
}

class HDFCAccount implements IAccount {
	double balance = 1000.0;

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount deposited Successfully");
	}

	@Override
	public void withdraw(double amount) {
		if (balance <= amount) {
			System.out.println("The balance is unsuffiecient");
		} else {
			balance = balance - amount;
		}
	}

	@Override
	public double getBalance() {
		return balance;
	}
}

public class ProblemStatement5 {

}
