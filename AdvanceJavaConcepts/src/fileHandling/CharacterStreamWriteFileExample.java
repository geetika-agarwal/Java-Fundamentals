package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharacterStreamWriteFileExample {
	public static void main(String[] args) {
		try (Writer writer = new FileWriter("C:\\Users\\geeti\\eclipse-wiley-workshop\\Files\\myFile.txt")) {
			writer.write("Hello folks!!!");
			writer.write("Writing Data through Character Stream");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
