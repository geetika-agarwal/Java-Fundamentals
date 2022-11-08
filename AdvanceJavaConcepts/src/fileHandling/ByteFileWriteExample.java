package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ByteFileWriteExample {

	public static void main(String[] args) {
		// Output Stream: Writing into the file
		// Input Stream: Reading from the file.

		try {
			FileOutputStream outStream = new FileOutputStream(
					"C:\\\\Users\\\\geeti\\\\eclipse-wiley-workshop\\\\Files\\\\myFile.txt");
			Writer writer = new OutputStreamWriter(outStream);

			writer.write("Hello Everyone!!");
			writer.write("I'm writing some content into the file");

			writer.close();
			outStream.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
