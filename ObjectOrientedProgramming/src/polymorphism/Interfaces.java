package polymorphism;

interface IManageAccount {
	void openAccount();

	void closeAccount();
}

interface IBankAccount extends IManageAccount {
	public static final int rate_of_interface = 1;

	public static void welcomeMessage() {
		System.out.println("Welcome Message");
	}

	public default void message() {
		System.out.println("Welcome Default Message");
	}

	void deposit();

	void withdraw();

	void balance();
}

class SavingsAccount implements IBankAccount {

	@Override
	public void deposit() {
		System.out.println("Deposit in Saving Account");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw in Saving Account");
	}

	@Override
	public void balance() {
		System.out.println("Balance in Saving Account");
	}

	@Override
	public void openAccount() {
		System.out.println("Opening a Saving  Account");
	}

	@Override
	public void closeAccount() {
		System.out.println("Closing a Savings Account");
	}
}

public class Interfaces {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		IBankAccount.welcomeMessage(); // static method in interface
		sa.message(); // default method in interface

		sa.deposit();
		sa.withdraw();
		sa.balance();
		sa.openAccount();
		sa.closeAccount();
	}
}
