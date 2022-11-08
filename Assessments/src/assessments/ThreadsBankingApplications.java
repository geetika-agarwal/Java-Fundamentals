package assessments;

class Bank {
	double balance = 1000.0;
	double amt;
	String personName;

	Bank() {
		super();
	}

	Bank(double balance) {
		this.balance = balance;
	}

	void withdrawal(String name, double amount) {
		if (balance < amount) {
			System.out.println("Insufficient Balance");
//			Thread.currentThread().interrupt();
		} else {
			balance = balance - amount;
			System.out.println(
					"Withdrawal done by " + name + " of amount " + amount + " is successful. Balance: " + balance);
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void deposit(String name, double amount) {
		balance = balance + amount;
		System.out.println("Deposit done by " + name + " of amount " + amount + " is successful. Balance: " + balance);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class WithdrawalThread extends Thread {
	double amount;
	String name;
	Bank b;

	WithdrawalThread(Bank obj, String name, double amount) {
		this.name = name;
		this.amount = amount;
		this.b = obj;
	}

	@Override
	public void run() {
		b.withdrawal(name, amount);
	}
}

class DepositThread extends Thread {
	double amount;
	String name;
	Bank b;

	DepositThread(Bank obj, String name, double amount) {
		this.name = name;
		this.amount = amount;
		this.b = obj;
	}

	@Override
	public void run() {
		b.deposit(name, amount);
	}
}

public class ThreadsBankingApplications {
	public static void main(String[] args) throws InterruptedException {
		Bank bank = new Bank(5000.0);

		WithdrawalThread wThread = new WithdrawalThread(bank, "King", 1000.0);
		DepositThread dThread = new DepositThread(bank, "Queen", 2000.0);

		WithdrawalThread wThread1 = new WithdrawalThread(bank, "Prince", 1000.0);
		DepositThread dThread1 = new DepositThread(bank, "Soldier", 4000.0);

		wThread.start();
		wThread.join();
		wThread1.start();
		wThread1.join();
		dThread.start();
		dThread.join();
		dThread1.start();
		dThread1.join();
	}
}
