package Assessment;

abstract class Account {

	protected int accountNumber;
	protected String accountName;

	public Account(int accountNumber, String accountName) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
	}

	abstract public void display();

}

abstract class Deposit extends Account {
	int amount;
	String maturityDate;
	String openingDate;

	Deposit(int accountNumber, String accountName, int amount, String maturityDate, String openingDate) {
		super(accountNumber, accountName);
		this.amount = amount;
		this.maturityDate = maturityDate;
		this.openingDate = openingDate;
	}
}

class ShortTerm extends Deposit {
	int noOfMonths;

	ShortTerm(int accountNumber, String accountName, int amount, String maturityDate, String openingDate,
			int noOfMonths) {
		super(accountNumber, accountName, amount, maturityDate, openingDate);
		this.noOfMonths = noOfMonths;
	}

	@Override
	public void display() {
		System.out.println("The Short Term Details are: ");
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Account Name: " + this.accountName);
		System.out.println("Amount: " + this.amount);
		System.out.println("Maturity Date: " + this.maturityDate);
		System.out.println("Opening Date: " + this.openingDate);
		System.out.println("Number of Months: " + this.noOfMonths);
	}
}

class LongTerm extends Deposit {
	int noOfMonths;

	LongTerm(int accountNumber, String accountName, int amount, String maturityDate, String openingDate,
			int noOfMonths) {
		super(accountNumber, accountName, amount, maturityDate, openingDate);
		this.noOfMonths = noOfMonths;
	}

	@Override
	public void display() {
		System.out.println("The Long Term Details are: ");
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Account Name: " + this.accountName);
		System.out.println("Amount: " + this.amount);
		System.out.println("Maturity Date: " + this.maturityDate);
		System.out.println("Opening Date: " + this.openingDate);
		System.out.println("Number of Months: " + this.noOfMonths);
	}
}

class Saving extends Account {
	private int balance;

	Saving(int accountNumber, String accountName, int balance) {
		super(accountNumber, accountName);
		this.balance = balance;
	}

	@Override
	public void display() {
		System.out.println("Saving Account Details: ");
		System.out.println("Account Number: " + super.accountNumber);
		System.out.println("Account Name: " + super.accountName);
		System.out.println("Balance: " + this.balance);
	}
}

public class OverridingBanking {
	public static void main(String[] args) {
		Saving sa = new Saving(1001, "abc", 30000);
		sa.display();

		System.out.println("========================");
		ShortTerm st = new ShortTerm(1002, "def", 35000, "21 Oct, 2023", "21 Oct, 2022", 12);
		st.display();

		System.out.println("========================");
		LongTerm lt = new LongTerm(1003, "ghi", 25000, "21 Nov, 2023", "21 Sept, 2022", 14);
		lt.display();
	}
}
