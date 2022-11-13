package java_oops_problems;

/*
 * 1.	Create a class called Invoice that a hardware store might use to represent an invoice for an 
 * item sold at the store. An Invoice should include four pieces of information as instance variables
 * ‐a part number (type String), a part description (type String), a quantity of the item being 
 * purchased (type int) and a price per item (double). Your class should have a constructor 
 * that initializes the four instance variables. Provide a set and a get method for each instance 
 * variable. In addition, provide a method named getInvoiceAmount that calculates the invoice 
 * amount (i.e., multiplies the quantity by the price per item), then returns the amount 
 * as a double value. If the quantity is not positive, it should be set to 0. If the price per item is 
 * not positive, it should be set to 0.0. Write a test application named InvoiceTest that demonstrates 
 * class Invoice’s capabilities.
 * */

class Invoice {
	String number;
	String desc;
	int quantity;
	double price;

	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Invoice(String number, String desc, int quantity, double price) {
		super();
		this.number = number;
		this.desc = desc;
		if (quantity < 0)
			this.quantity = 0;
		else
			this.quantity = quantity;
		if (price < 0)
			this.price = 0;
		else
			this.price = price;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0)
			this.quantity = 0;
		else
			this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0)
			this.price = 0;
		else
			this.price = price;
	}

	public double getInvoiceAmount() {
		return quantity * price;
	}
}

public class Problem1 {
	public static void main(String[] args) {
		Invoice inv = new Invoice("100", "item1", 5, 100.0);
		System.out.println("The invoice amount: " + inv.getInvoiceAmount());
	}
}
