package polymorphism;

// Simple example of abstract class. It is compulsory to 
// override the abstract methods.

abstract class ManageAccount {

	public static void welcomeMessage() {
		System.out.println("Welcome to our Bank");
	}

	public abstract void openAccount();

	public abstract void closeAccount();
}

abstract class BankAccount extends ManageAccount {
	public abstract void deposit();

	public abstract void balance();

	public abstract void withdraw();
}

class SavingAccount extends BankAccount {
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
		System.out.println("Open savings account");
	}

	@Override
	public void closeAccount() {
		System.out.println("Closing savings account");
	}
}

class CurrentAccount extends BankAccount {
	@Override
	public void deposit() {
		System.out.println("Deposit in Current Account");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw in Current Account");
	}

	@Override
	public void balance() {
		System.out.println("Balance in Current Account");
	}

	@Override
	public void openAccount() {
		System.out.println("Open current account");
	}

	@Override
	public void closeAccount() {
		System.out.println("Closing current account");
	}
}

public class AbstractClasses {

	public static void main(String[] args) {
		ManageAccount.welcomeMessage();
		SavingAccount sa = new SavingAccount();
		sa.deposit();
		sa.withdraw();
		sa.balance();
		sa.openAccount();
		sa.closeAccount();

		System.out.println("======================");

		CurrentAccount ca = new CurrentAccount();
		ca.deposit();
		ca.withdraw();
		ca.deposit();
		ca.openAccount();
		ca.closeAccount();
	}

}
