package fileHandling;

import java.io.File;

public class FileInformationExample {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\geeti\\eclipse-wiley-workshop\\Files\\myFile.txt");

		if (file.exists()) {
			System.out.println("File Exists");
			System.out.println("File Name: " + file.getName());
			System.out.println("File Absolute Path: " + file.getAbsolutePath());
			System.out.println("File Readable: " + file.canRead());
			System.out.println("File Writable: " + file.canWrite());
			System.out.println("File Length: " + file.length());
		} else
			System.out.println("File doesn't Exist");
	}
}
