package exceptions;

import java.util.Scanner;

class MyException1 extends Exception {
	public MyException1() {
		super();
	}

	public MyException1(String message) {
		super(message);
	}
}

class ProfitLoss {
	public static void check(int sellingPrice, int costPrice) throws MyException1 {
		if (costPrice < 0)
			throw new MyException1("Cost Price cannot be negative");
		else if (sellingPrice < 0)
			throw new MyException1("Selling Price cannot be negative");
		else if (sellingPrice == costPrice)
			throw new MyException1("Cost Price cannot be equal to Selling Price");
		else if (sellingPrice > costPrice)
			System.out.println("Profit");
		else if (costPrice > sellingPrice)
			System.out.println("Loss");
	}
}

public class CustomException {
	public static void main(String[] args) {
		int sellingPrice, costPrice;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Selling Price");
			sellingPrice = sc.nextInt();
			System.out.println("Enter Cost Price");
			costPrice = sc.nextInt();
			ProfitLoss.check(sellingPrice, costPrice);
		} catch (MyException1 e) {
			System.out.println(e.getMessage());
		}
	}
}
