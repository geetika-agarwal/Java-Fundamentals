package fileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharacterStreamReadFile {
	public static void main(String[] args) {
		try (Reader reader = new FileReader("C:\\\\Users\\\\geeti\\\\eclipse-wiley-workshop\\\\Files\\\\myFile.txt")) {
			int data = reader.read();
			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
