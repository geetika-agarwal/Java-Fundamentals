package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreatingNewFileExample {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\geeti\\eclipse-wiley-workshop\\Files\\myFile.txt");
		if (file.createNewFile())
			System.out.println("New File is created");
		else
			System.out.println("File is already present in the directory");
	}

}
