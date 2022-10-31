package assessment_28_10;

import java.io.Serializable;

public class Invoice implements Serializable {
	String number;
	String description;
	int quantity;
	double price;

	public Invoice(String number, String description, int quantity, double price) {
		super();
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getInvoice() {
		if (quantity < 0)
			quantity = 0;
		if (price < 0.0)
			price = 0.0;

		return (price * quantity);
	}

	@Override
	public String toString() {
		return "Invoice [number=" + number + ", description=" + description + ", quantity=" + quantity + ", price="
				+ price + "]";
	}

}
