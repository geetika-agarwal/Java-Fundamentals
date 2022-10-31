package assessment_28_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class InvoiceTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Invoice[] invoice = new Invoice[5];

		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < 5; i++) {
				sc.nextLine();
				System.out.println("Enter the number: ");
				String number = sc.nextLine();
				System.out.println("Enter the description: ");
				String desc = sc.nextLine();
				System.out.println("Enter the quantity: ");
				int quan = sc.nextInt();
				System.out.println("Enter the Price: ");
				double price = sc.nextDouble();

				invoice[i] = new Invoice(number, desc, quan, price);
			}
		}

		FileOutputStream outputStream = new FileOutputStream(
				"C:\\Users\\geeti\\eclipse-wiley-workshop\\Files\\invoiceData.txt");
		ObjectOutputStream out = new ObjectOutputStream(outputStream);

		out.writeObject(invoice);

		out.flush();
		out.close();
		outputStream.close();

		System.out.println("Object Serialized Successfully");

		FileInputStream inStream = new FileInputStream(
				"C:\\Users\\geeti\\eclipse-wiley-workshop\\Files\\invoiceData.txt");
		ObjectInputStream in = new ObjectInputStream(inStream);

		Invoice[] inv = (Invoice[]) in.readObject();

		System.out.println(inv[1]);
		System.out.println(inv[2]);
		System.out.println(inv[3]);
		System.out.println(inv[4]);
		System.out.println(inv[5]);
		in.close();
		inStream.close();
	}
}
