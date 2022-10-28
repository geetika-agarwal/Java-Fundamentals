package fileHandling;

import java.io.*;

public class ByteReadFileExample {
	public static void main(String[] args) {

		try (InputStream inputStream = new FileInputStream(
				"C:\\\\Users\\\\geeti\\\\eclipse-wiley-workshop\\\\Files\\\\myFile.txt")) {
			try (Reader reader = new InputStreamReader(inputStream)) {
				int data = reader.read();

				while (data != -1) {
					System.out.print((char) data);
					data = reader.read();
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
