package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ByteFileWriteExampleTwo {
	public static void main(String[] args) {
		try (OutputStream outStream = new FileOutputStream(
				"C:\\\\Users\\\\geeti\\\\eclipse-wiley-workshop\\\\Files\\\\myFile.txt")) {
			try (Writer writer = new OutputStreamWriter(outStream)) {
				writer.write("Hello Everyone!!! \n");
				writer.write("My name is Geetika Agarwal");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
