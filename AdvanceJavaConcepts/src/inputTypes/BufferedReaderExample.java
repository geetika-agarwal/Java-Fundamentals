package inputTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the name: ");
		String name = reader.readLine();

		System.out.println("Enter the age: ");
		int age = Integer.parseInt(reader.readLine());

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
