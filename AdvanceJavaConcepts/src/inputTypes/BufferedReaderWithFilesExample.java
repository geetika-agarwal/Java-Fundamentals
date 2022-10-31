package inputTypes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderWithFilesExample {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\geeti\\eclipse-wiley-workshop\\Files\\myFile.txt"));

		int i;
		while ((i = reader.read()) != -1) {
			System.out.print((char) i);
		}
	}

}
